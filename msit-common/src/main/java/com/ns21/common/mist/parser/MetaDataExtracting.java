package com.ns21.common.mist.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.ns21.common.mist.dto.*;
import com.ns21.common.MistLauncher;
import io.vertx.core.AbstractVerticle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * packageName    : com.ns21.tim.metaprocess
 * fileName       : MetaDataProcessing.java
 * author         : kjg08
 * date           : 2023-11-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-23        kjg08           최초 생성
 */
public class MetaDataExtracting extends AbstractVerticle {
    MistLauncher mistLauncher = new MistLauncher();
    private static final Logger logger = LoggerFactory.getLogger(MetaDataExtracting.class);

    @Override
    public void start() {

        MetaDataParser parser = new MetaDataParser(vertx);

        // DatasetDto 파일 처리
        parser.parseFile("metadata/dataset.json", new TypeReference<>() {}, this::processDatasetDto);

        // EgoPoseDto 파일 처리
        parser.parseFile("metadata/ego_pose.json", new TypeReference<>() {}, this::processEgoPoseDto);

        // FrameAnnotationDto 파일 처리
        parser.parseFile("metadata/frame_annotation.json", new TypeReference<>() {}, this::processFrameAnnotationDto);

        // FrameDataDto 파일 처리
        parser.parseFile("metadata/frame_data.json", new TypeReference<>() {}, this::processFrameDataDto);

        // FrameDto 파일 처리
        parser.parseFile("metadata/frame.json", new TypeReference<>() {}, this::processFrameDto);

        // InstanceDto 파일 처리
        parser.parseFile("metadata/instance.json", new TypeReference<>() {}, this::processInstanceDto);

        // LogDto 파일 처리
        parser.parseFile("metadata/log.json", new TypeReference<>() {}, this::processLogDto);

        // PresetDto 파일 처리
        parser.parseSingleObjectFile("metadata/preset.json", new TypeReference<PresetDto>() {}, this::processPresetDto);

        // SensorDto 파일 처리
        parser.parseFile("metadata/sensor.json", new TypeReference<List<SensorDto>>() {}, this::processSensorDto);
    }

    private void processDatasetDto(List<DatasetDto> datasets) {
        logger.info(mistLauncher.LOG_FORMMAT_HEAD, "Processing DatasetDto");
        for (DatasetDto dataset : datasets) {
            logger.info(dataset.toString()); // DatasetDto 객체의 상태를 로그로 출력
        }
    }
    private void processEgoPoseDto(List<EgoPoseDto> egoposes) {
        logger.info(mistLauncher.LOG_FORMMAT_HEAD, "Processing EgoPoseDto");
        for (EgoPoseDto egopose : egoposes) {
            logger.info(egopose.toString()); // EgoPoseDto 객체의 상태를 로그로 출력
        }
    }
    private void processFrameAnnotationDto(List<FrameAnnotationDto> frameAnnotations) {
        logger.info(mistLauncher.LOG_FORMMAT_HEAD,"Processing FrameAnnotationDto");
        for (FrameAnnotationDto frameAnnotation : frameAnnotations) {
            logger.info(frameAnnotation.toString());
        }
    }

    private void processFrameDataDto(List<FrameDataDto> frameData) {
        logger.info(mistLauncher.LOG_FORMMAT_HEAD,"Processing FrameDataDto");
        for (FrameDataDto data : frameData) {
            logger.info(data.toString());
        }
    }

    private void processFrameDto(List<FrameDto> frames) {
        logger.info(mistLauncher.LOG_FORMMAT_HEAD,"Processing FrameDto");
        for (FrameDto frame : frames) {
            logger.info(frame.toString());
        }
    }

    private void processInstanceDto(List<InstanceDto> instances) {
        logger.info(mistLauncher.LOG_FORMMAT_HEAD,"Processing InstanceDto");
        for (InstanceDto instance : instances) {
            logger.info(instance.toString());
        }
    }

    private void processLogDto(List<LogDto> logs) {
        logger.info(mistLauncher.LOG_FORMMAT_HEAD,"Processing LogDto");
        for (LogDto log : logs) {
            logger.info(log.toString());
        }
    }

    private void processPresetDto(PresetDto preset) {
        logger.info(mistLauncher.LOG_FORMMAT_HEAD,"Processing PresetDto");
        logger.info(preset.toString());
    }


    private void processSensorDto(List<SensorDto> sensors) {
        logger.info(mistLauncher.LOG_FORMMAT_HEAD,"Processing SensorDto");
        for (SensorDto sensor : sensors) {
            logger.info(sensor.toString());
        }
    }
}
