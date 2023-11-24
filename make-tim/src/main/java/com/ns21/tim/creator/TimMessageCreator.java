package com.ns21.tim.creator;

import com.ns21.common.mist.codec.J2735ToJson;
import com.ns21.common.mist.codec.JsonToJ2735;
import com.ns21.common.mist.dto.*;
import io.vertx.core.AbstractVerticle;
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
        // DTO 객체들의 초기화
        DatasetDto datasetDto = new DatasetDto();
        EgoPoseDto egoPoseDto = new EgoPoseDto();
        FrameAnnotationDto frameAnnotationDto = new FrameAnnotationDto();
        LogDto logDto = new LogDto();
        PresetDto presetDto = new PresetDto();
        SensorDto sensorDto = new SensorDto();
        // TimMessageCreator를 통해 JSON 메시지 생성
        String jsonMessage = TimValueCreator.createTimMessage(datasetDto, egoPoseDto, frameAnnotationDto, logDto, presetDto, sensorDto);


        // JSON을 J2735 형식으로 변환하고 다시 JSON으로 변환
        String j2735String = JsonToJ2735.convertToJ2735(jsonMessage);
        String jsonResult = J2735ToJson.convertToJSON(j2735String);

        // 로그로 출력
        logger.info("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        logger.info(jsonResult);
    }
}
