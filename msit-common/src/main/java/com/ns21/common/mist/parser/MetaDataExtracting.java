package com.ns21.common.mist.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns21.common.mist.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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
public class MetaDataExtracting  {
    private static final Logger logger = LoggerFactory.getLogger(MetaDataExtracting.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();

    // 메인 메서드
    public static void main(String[] args) {
        MetaDataExtracting extractor = new MetaDataExtracting();
        extractor.processFiles();
    }
    // 파일 처리 메서드
    public void processFiles() {
        processFile("msit-common/src/main/resources/metadata/dataset.json", new TypeReference<List<DatasetDto>>() {});
        processFile("msit-common/src/main/resources/metadata/ego_pose.json", new TypeReference<List<EgoPoseDto>>() {});
        processFile("msit-common/src/main/resources/metadata/frame_annotation.json", new TypeReference<List<FrameAnnotationDto>>() {});
        processFile("msit-common/src/main/resources/metadata/frame_data.json", new TypeReference<List<FrameDataDto>>() {});
        processFile("msit-common/src/main/resources/metadata/frame.json", new TypeReference<List<FrameDto>>() {});
        processFile("msit-common/src/main/resources/metadata/instance.json", new TypeReference<List<InstanceDto>>() {});
        processFile("msit-common/src/main/resources/metadata/log.json", new TypeReference<List<LogDto>>() {});
        processFile("msit-common/src/main/resources/metadata/preset.json", new TypeReference<PresetDto>() {});
        processFile("msit-common/src/main/resources/metadata/sensor.json", new TypeReference<List<SensorDto>>() {});
    }

    // 파일 읽기 및 파싱 메서드
    public <T> void processFile(String filePath, TypeReference<T> typeReference) {
        try {
            String fileContent = new String(Files.readAllBytes(new File(filePath).toPath()));
            T dataList = objectMapper.readValue(fileContent, typeReference);

            // 데이터 처리
            if (dataList instanceof List) {
                ((List<?>) dataList).forEach(data -> logger.info(data.toString()));
            } else {
                logger.info(dataList.toString());
            }
        } catch (IOException e) {
            logger.error("Error reading or parsing file: " + filePath, e);
        }
    }
}