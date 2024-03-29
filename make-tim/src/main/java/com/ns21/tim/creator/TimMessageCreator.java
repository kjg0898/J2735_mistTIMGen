package com.ns21.tim.creator;

import com.ns21.common.enums.j2735.J2735MessageID;
import com.ns21.common.mist.codec.J2735ToJson;
import com.ns21.common.mist.codec.JsonToJ2735;
import com.ns21.common.mist.parser.MetaDataExtracting;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * packageName    : com.ns21.tim.creator
 * fileName       : TimMessageCreator.java
 * author         : kjg08
 * date           : 2023-11-24
 * description    :JSON 처리 및 열거형과 코덱 처리
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-24        kjg08           최초 생성
 */



public class TimMessageCreator extends AbstractVerticle {
    private static final Logger logger = LoggerFactory.getLogger(TimMessageCreator.class);
    private static int currentIndex = 0;
    private List<String> jsonMessages;
    private long timerId; // 클래스 레벨 변수로 선언

   /* // ITIS 코드를 추가하는 별도의 함수
    private void addItisCode(Map<String, Object> uuidMap, String key, Function<String, Integer> itisCodeMapper, List<Map<String, Object>> advisory) {
        String value = uuidMap.containsKey(key) ? (String) uuidMap.get(key) : "0";
        if (value != null && !value.equals("0")) {
            Integer itisCode = itisCodeMapper.apply(value);
            if (itisCode != null) {
                Map<String, Object> itemWrapper = new LinkedHashMap<>();
                Map<String, Object> item = new LinkedHashMap<>();
                item.put("itis", itisCode);
                itemWrapper.put("item", item);
                advisory.add(itemWrapper);
            }
        }
    }*/

    @Override
    public void start() {
        // 메타데이터 추출 및 처리
        MetaDataExtracting extractor = new MetaDataExtracting();
        extractor.processFiles().thenRun(() -> {
            logger.info("----------------------  Reading and parsing metadata Please wait . . .  ----------------------");
            // 메시지 목록은 한 번만 생성
            try {
                jsonMessages = TimValueCreator.createTimMessage();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            logger.info("----------------------  The task is complete  ----------------------");
            logger.info("Total messages generated: {}", jsonMessages.size());

            // 모든 메시지 처리 후 타이머 중지를 위한 핸들러 ID 저장
            timerId = vertx.setPeriodic(1000, id -> {
                if (!jsonMessages.isEmpty() && currentIndex < jsonMessages.size()) {
                    // 현재 인덱스에 따라 하나의 메시지를 선택합니다.
                    String jsonMessage = jsonMessages.get(currentIndex);
                    logger.info("Sending message at index: {}", currentIndex);

                    // 메시지 처리 로직
                    processMessage(jsonMessage);

                    // 현재 인덱스를 증가시키고, 모든 메시지 처리 시 타이머 중지
                    currentIndex++;
                    if (currentIndex >= jsonMessages.size()) {
                        logger.info("All messages sent. Stopping timer.");
                        vertx.cancelTimer(timerId);
                    }
                }
            });
        });
    }

    private void processMessage(String jsonMessage) {
        try {
            // 메시지 아이디 추가 및 변환 로직
            JsonObject originalJsonObject = new JsonObject(jsonMessage);
            JsonObject newJsonObject = new JsonObject();
            newJsonObject.put("messageId", J2735MessageID.TIM.getId());
            newJsonObject.put("value", originalJsonObject);
            jsonMessage = newJsonObject.toString();

            // JSON을 J2735 형식으로 변환하고 다시 JSON으로 변환
            String j2735Result = JsonToJ2735.convertToJ2735(jsonMessage);
            String jsonResult = J2735ToJson.convertToJSON(j2735Result);

            // 로그 출력
            logger.info("------------------------------------- convert to J2735 -------------------------------------");
            logger.info("convertToJ2735 : {}", j2735Result);
            logger.info("------------------------------------- convert to Json -------------------------------------");
            logger.info("convertToJson : {}", jsonResult);
        } catch (Exception e) {
            logger.error("Error in message processing", e);
        }
    }
}