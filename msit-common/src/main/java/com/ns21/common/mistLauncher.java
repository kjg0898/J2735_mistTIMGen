package com.ns21.common;

import com.ns21.common.util.VertxJsonUtil;
import io.vertx.core.Launcher;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class mistLauncher extends Launcher {

    private final String LOG_FORMMAT_HEAD = "------------------------------------------------------------------------------ {} ------------------------------------------------------------------------------";
    private final String LOG_FORMMAT_END = "------------------------------------------------------------------------------ {} ------------------------------------------------------------------------------";
    private final String VERTX_PROFILE_ACTIVE_KEY = "vertx.profile.active";
    private final String DEFAULT_CONFIG_FILE = "application.yaml";


    private static final Logger logger = LoggerFactory.getLogger(mistLauncher.class);

    public static void main(String[] args) {

        List liArguments = Arrays.asList(args);
        logger.info("arguments: {}", liArguments);

        new mistLauncher().dispatch(args);
    }

    @Override
    public void afterConfigParsed(JsonObject config) {
        logger.info(LOG_FORMMAT_HEAD, "afterConfigParsed");
        logger.info("config {}", config);
        JsonObject conf = null;

        // -conf argument로 전달받은 설정 파일이 있으면 기본 설정파일을 읽어 들이지 않음.
        if( config.size() == 0 ) {
            // application.json 파일 로딩 하여 config 파라미터 객체에 추가
            logger.info("config size is 0. so default_config setting");
            conf = readConfigStream(DEFAULT_CONFIG_FILE);
        }

        if( conf != null ) {
            JsonObject mainConf = conf.getJsonObject("module");
            String activeEnv = System.getenv("MODULE_ACTIVE_PROFILE");
            String activeProfileName = activeEnv != null ? activeEnv : VertxJsonUtil.jsonReadValueToString(mainConf, VERTX_PROFILE_ACTIVE_KEY);
            if(activeProfileName == null ) {
                logger.error("config vertx.profile.active is empty");
                return;
            }

            config.mergeIn(mainConf);
            config.mergeIn(conf.getJsonObject(activeProfileName));
        }
        logger.info("After merge config: {}", config);

        logger.info(LOG_FORMMAT_END, "afterConfigParsed");
    }
    private JsonObject readConfigStream(String fileName) {

        InputStream is = getConfigFromFile(fileName);
        if (is == null) {
            is = getConfigStreamFromClasspath( fileName );
        }

        if( is == null ) {
            logger.warn("Can not find default config file: {}", fileName);
            return null;
        } else {
            logger.info("find default config file: {}", fileName);
        }

        Iterator<Object> objects = new Yaml().loadAll(is).iterator();
        if(objects.hasNext()) {
            Map<String, Object> next = (Map<String, Object>) objects.next();
            return new JsonObject(next);
        } else {
            try {
                throw new FileNotFoundException("can not read yaml file");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private InputStream getConfigFromFile(String configFile) {
        try {
            FileInputStream fis = new FileInputStream(configFile);
            return fis;
        } catch (FileNotFoundException e) {
            logger.info("file not found exception");
        }
        return null;
    }

    private InputStream getConfigStreamFromClasspath(String configFile) {
        InputStream is = null;
        ClassLoader ctxClsLoader = Thread.currentThread().getContextClassLoader();
        if (ctxClsLoader != null) {
            is = ctxClsLoader.getResourceAsStream(configFile);
        }
        return is;
    }
}
