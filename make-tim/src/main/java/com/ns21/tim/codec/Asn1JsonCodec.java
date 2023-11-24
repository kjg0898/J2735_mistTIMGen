package com.ns21.tim.codec;
 /* packageName    : PACKAGE_NAME
 * fileName       : ExecutionModule.java
 * author         : kjg08
 * date           : 2023-11-16
 * description    : 생성된 json 메세지를 asn.1로 혹은 asn.1 메세지를 json 메세지로 변환하는 클래스
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-16        kjg08           최초 생성
 */

import com.ns21.common.mist.codec.J2735ToJson;
import com.ns21.common.mist.codec.JsonToJ2735;
import com.ns21.common.exception.JsonToJ2735Exception;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.function.Function;
public class Asn1JsonCodec extends AbstractVerticle {
    private static final Logger logger = LoggerFactory.getLogger(Asn1JsonCodec.class);


   /* private void processFile(String filePath, Function<String, String> lineProcessor) throws IOException {
        String resourcePath = "make-tim/src/main/resources/" + filePath;
        int i = 0;
        File file = new File(resourcePath);

        if (!file.exists()) {
            logger.info("파일이 존재하지 않습니다: " + resourcePath);
            throw new FileNotFoundException("File not found: " + resourcePath);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                lineCount++;
                try {
                    logger.info("\n \n ----------------------------------------------------------------- " + filePath + " 파일의 " + lineCount + " 번째 줄 -----------------------------------------------------------------  ");
                    logger.info("Result: " + lineProcessor.apply(line));
                } catch (Exception e) {
                    logger.info(String.format("Error processing line %s, error: %s", line, e));
                }
                if (lineCount == 0) {
                    logger.info("파일 내용이 비어 있습니다: " + resourcePath);
                } else {
                    logger.info("파일 처리 완료: " + resourcePath + ", 총 " + lineCount + " 줄 처리됨");
                }
            }
        }
    }
*/
    @Override
    public void start(Promise<Void> startPromise) {
        // 파일 처리를 위한 비동기 작업 생성
        Future<Void> processJson = processFileAsync("testTimJson.txt", data -> {
            try {
                return JsonToJ2735.convertToJ2735(data);
            } catch (JsonToJ2735Exception e) {
                throw new RuntimeException(e);
            }
        });

        Future<Void> processJ2735 = processFileAsync("testTimJ2735.txt", data -> {
            try {
                return J2735ToJson.convertToJSON(data);
            } catch (JsonToJ2735Exception e) {
                throw new RuntimeException(e);
            }
        });

        // 모든 파일 처리가 완료되면 startPromise를 완료합니다.
        CompositeFuture.all(processJson, processJ2735).onComplete(ar -> {
            if (ar.succeeded()) {
                startPromise.complete();
            } else {
                startPromise.fail(ar.cause());
            }
        });
    }

    // processFile 메서드를 비동기 처리를 위한 Future로 변환
    private Future<Void> processFileAsync(String filePath, Function<String, String> lineProcessor) {
        Promise<Void> promise = Promise.promise();

        vertx.executeBlocking(future -> {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("make-tim/src/main/resources/" + filePath));
                processFileLineByLine(reader, lineProcessor, future, 0);
            } catch (Exception e) {
                future.fail(e);
            }
        }, res -> {
            if (res.succeeded()) {
                promise.complete();
            } else {
                promise.fail(res.cause());
            }
        });

        return promise.future();
    }
    // 파일의 각 줄을 순차적으로 처리하는 메서드
    private void processFileLineByLine(BufferedReader reader, Function<String, String> lineProcessor, Promise<Object> future, int lineCount) throws IOException {
        String line = reader.readLine();
        if (line == null) {
            reader.close();
            future.complete(); // 파일 끝에 도달했으므로 작업 완료
            return;
        }

        if (!line.trim().isEmpty()) {
            try {
                lineCount++;
                logger.info("\n \n ----------------------------------------------------------------- 파일의 " + lineCount + " 번째 줄 -----------------------------------------------------------------  ");
                logger.info("Result: " + lineProcessor.apply(line));
            } catch (Exception e) {
                logger.error("Error processing line: " + line, e);
            }
        }

        // 다음 줄을 1초 후에 처리
        int finalLineCount = lineCount;
        vertx.setTimer(1000, id -> {
            try {
                processFileLineByLine(reader, lineProcessor, future, finalLineCount);
            } catch (IOException e) {
                future.fail(e);
            }
        });
    }
}
