package com.ns21.common.mist.codec;
import com.ns21.common.enums.j2735.CODER_TYPE;
import com.ns21.common.util.ASN1CodeFactory;
import com.ns21.common.util.ConvertUtil;
import com.ns21.common.util.JsonToJ2735Exception;
import com.oss.asn1.AbstractData;
import com.oss.asn1.Coder;
import dsrc.dsrc.MessageFrame;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/**
 * packageName    : com.ns21.common.mist.codec
 * fileName       : j2735ToJson.java
 * author         : kjg08
 * date           : 2023-11-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-17        kjg08           최초 생성
 */
/**
 * j2735ToJson 클래스는 J2735 형식의 데이터를 JSON 형식으로 변환합니다.
 * 이 클래스는 ASN.1 코더를 사용하여 메시지를 디코딩하고 JSON으로 인코딩합니다.
 */
public class j2735ToJson {
    private static final Logger logger = LoggerFactory.getLogger(j2735ToJson.class);

    /**
     * J2735 형식의 문자열을 JSON 형식으로 변환합니다.
     *
     * @param data 변환할 J2735 형식의 데이터
     * @return JSON 형식의 문자열
     * @throws JsonToJ2735Exception 변환 과정에서 오류가 발생한 경우
     */
    public static String convertToJSON(String data) throws JsonToJ2735Exception {
        if (data == null || data.isEmpty()) {
            throw new JsonToJ2735Exception("Input data is null or empty");
        }

        logger.info("Converting J2735 to JSON format. Input data: {}", data);
        try (ByteArrayInputStream bai = new ByteArrayInputStream(ConvertUtil.hexStringToBytes(data));
             ByteArrayOutputStream bao = new ByteArrayOutputStream()) {

            Coder berCoder = ASN1CodeFactory.createCoder(CODER_TYPE.BER);
            Coder jsonCoder = ASN1CodeFactory.createCoder(CODER_TYPE.JSON);

            AbstractData messageFrame = new MessageFrame();
            messageFrame = berCoder.decode(bai, messageFrame);

            jsonCoder.encode(messageFrame, bao);
            String jsonMsg = bao.toString();

            return jsonMsg;

        } catch (IOException e) {
            logger.error("IO Exception occurred during J2735 to JSON conversion: {}", e.getMessage(), e);
            throw new JsonToJ2735Exception("IO Exception occurred", e);
        } catch (Exception e) {
            logger.error("Unexpected Exception occurred during J2735 to JSON conversion: {}", e.getMessage(), e);
            throw new JsonToJ2735Exception("Unexpected Exception occurred", e);
        }
    }
}
