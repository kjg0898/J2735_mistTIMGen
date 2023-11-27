package com.ns21.tim.creator;

import com.ns21.common.enums.j2735.J2735MessageID;
import com.ns21.common.mist.codec.J2735ToJson;
import com.ns21.common.mist.codec.JsonToJ2735;
import com.ns21.common.mist.dto.*;
import com.ns21.common.mist.parser.MetaDataExtracting;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * packageName    : com.ns21.tim.creator
 * fileName       : TimMessageCreator.java
 * author         : kjg08
 * date           : 2023-11-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-24        kjg08           최초 생성
 */
public class TimMessageCreator extends AbstractVerticle {
    private static final Logger logger = LoggerFactory.getLogger(TimMessageCreator.class);

    @Override
    public void start() throws Exception {

        // 메타데이터 추출 및 처리
        MetaDataExtracting extractor = new MetaDataExtracting();
        extractor.processFiles();

        // TimMessageCreator를 통해 JSON 메시지 생성
        String jsonMessage = TimValueCreator.createTimMessage();

        //메세지 아이디 추가
        JsonObject originalJsonObject  = new JsonObject(jsonMessage);
        // 새로운 최상위 JsonObject 생성
        JsonObject newJsonObject = new JsonObject();
        // messageId 추가
        int timMessgeId = J2735MessageID.TIM.getId();
        newJsonObject.put("messageId", timMessgeId);
        // 원래 객체를 'value' 라는 키로 새 객체에 추가
        newJsonObject.put("value", originalJsonObject);
        // 최종 JSON 문자열로 변환
        jsonMessage = newJsonObject.toString();

        // JSON을 J2735 형식으로 변환하고 다시 JSON으로 변환
        String j2735Result = JsonToJ2735.convertToJ2735(jsonMessage);
        String jsonResult = J2735ToJson.convertToJSON(j2735Result);

        // 로그로 출력
        logger.info("------------------------------------- convert to J2735 -------------------------------------" );
        logger.info("convertToJ2735 : {}" , j2735Result);
        logger.info("------------------------------------- convert to Json -------------------------------------" );
        logger.info("convertToJson : {}" , jsonResult);
    }
}
