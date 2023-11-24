package com.ns21.common.mist.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.jackson.DatabindCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Consumer;

/**
 * packageName    : com.ns21.common.mist.parser
 * fileName       : MetaDataParser.java
 * author         : kjg08
 * date           : 2023-11-23
 * description    : metadata 파일을 읽는 클래스
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-23        kjg08           최초 생성
 */


public class MetaDataParser {
    private static final Logger logger = LoggerFactory.getLogger(MetaDataParser.class);
    private final Vertx vertx;
    public MetaDataParser(Vertx vertx) {
        this.vertx = vertx;
    }
    public <T> void parseFile(String filePath, TypeReference<List<T>> typeReference, Consumer<List<T>> handler) {
        vertx.fileSystem().readFile(filePath, result -> {
            if (result.succeeded()) {
                Buffer fileData = result.result();
                try {
                    List<T> dataList = DatabindCodec.mapper().readValue(fileData.getBytes(), typeReference);
                    handler.accept(dataList);
                } catch (Exception e) {
                    logger.error("Error parsing file: " + filePath, e);
                    vertx.close(); // 에러 발생 시 Vert.x 인스턴스 종료
                }
            } else {
                logger.error("Failed to read file: " + filePath, result.cause());
                vertx.close(); // 파일 읽기 실패 시 Vert.x 인스턴스 종료
            }
        });
    }
    //단일객체 metadata 읽기 (preset.json 파일)
    public <T> void parseSingleObjectFile(String filePath, TypeReference<T> typeReference, Consumer<T> handler) {
        vertx.fileSystem().readFile(filePath, result -> {
            if (result.succeeded()) {
                Buffer fileData = result.result();
                try {
                    T data = DatabindCodec.mapper().readValue(fileData.getBytes(), typeReference);
                    handler.accept(data);
                } catch (Exception e) {
                    logger.error("Error parsing file: " + filePath, e);
                }
            } else {
                logger.error("Failed to read file: " + filePath, result.cause());
            }
        });
    }

}
