package com.ns21.common.mist.codec;

import com.ns21.common.enums.j2735.CODER_TYPE;
import com.ns21.common.enums.j2735.ASN1CodeFactory;
import com.ns21.common.util.ConvertUtil;
import com.ns21.common.exception.JsonToJ2735Exception;
import com.oss.asn1.AbstractData;
import com.oss.asn1.Coder;
import dsrc.dsrc.MessageFrame;
import io.vertx.core.json.DecodeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * jsonToJ2735 클래스는 JSON 데이터를 J2735 형식으로 변환합니다.
 * 이 클래스는 ASN.1 코더를 사용하여 메시지를 인코딩 및 디코딩합니다.
 */
public class JsonToJ2735 {
    private static final Logger logger = LoggerFactory.getLogger(JsonToJ2735.class);

    /**
     * JSON 문자열을 J2735 형식으로 변환합니다.
     *
     * @param data 변환할 JSON 문자열
     * @return J2735 형식의 문자열
     * @throws JsonToJ2735Exception 변환 과정에서 오류가 발생한 경우
     */
    public static String convertToJ2735(String data) throws JsonToJ2735Exception {
        if (data == null || data.isEmpty()) {
            throw new JsonToJ2735Exception("Input data is null or empty");
        }

        logger.info("Input Meta_JSON data: {}", data);
        try (ByteArrayInputStream bai = new ByteArrayInputStream(data.getBytes());
             ByteArrayOutputStream bao = new ByteArrayOutputStream()) {
            logger.info("{}", CODER_TYPE.JSON.getDesc());
            Coder jsonCoder = ASN1CodeFactory.createCoder(CODER_TYPE.JSON);
            Coder berCoder = ASN1CodeFactory.createCoder(CODER_TYPE.BER);

            AbstractData messageFrame = new MessageFrame();
            messageFrame = jsonCoder.decode(bai, messageFrame);
            berCoder.encode(messageFrame, bao);

            String jMsg = ConvertUtil.bytesToHexString(bao.toByteArray());

            return jMsg;

        } catch (IOException e) {
            logger.error("IO Exception occurred during JSON to J2735 conversion: {}", e.getMessage(), e);
            throw new JsonToJ2735Exception("IO Exception occurred", e);
        } catch (DecodeException e) {
            logger.error("Decoding Exception occurred during JSON to J2735 conversion: {}", e.getMessage(), e);
            throw new JsonToJ2735Exception("Decoding Exception occurred", e);
        } catch (Exception e) {
            logger.error("Unexpected Exception occurred during JSON to J2735 conversion: {}", e.getMessage(), e);
            throw new JsonToJ2735Exception("Unexpected Exception occurred", e);
        }
    }


}
