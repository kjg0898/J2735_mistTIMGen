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
import java.util.concurrent.CompletableFuture;

/**
 * fileName       : MetaDataExtracting.java
 * author         : kjg08
 * date           : 2023-11-23
 * description    :메타데이터 처리를 다루며, 파일에서 데이터를 읽고 구문 분석
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-23        kjg08           최초 생성
 */
public class MetaDataExtracting {
    private static final Logger logger = LoggerFactory.getLogger(MetaDataExtracting.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();

    // 파일 처리 메서드
    public CompletableFuture<Void> processFiles() {
        String path = "msit-common/src/main/resources/metadata/";
        return CompletableFuture.runAsync(() -> {
            processDatasets(path + "dataset.json");
            processEgoPoses(path + "ego_pose.json");
            processFrameAnnotations(path + "frame_annotation.json");
            processFrameDatas(path + "frame_data.json");
            processFrames(path + "frame.json");
            processInstances(path + "instance.json");
            processLogs(path + "log.json");
            processPresets(path + "preset.json");
            processSensors(path + "sensor.json");
        });
    }


    public void processDatasets(String filePath) {
        try {
            List<DatasetDto> datasets = readDataFromFile(filePath, new TypeReference<>() {
            });
            DataStorage.getInstance().storeDatasets(datasets);
            logger.info("reading  dataset.json file .... : " + filePath);
        } catch (IOException e) {
            logger.error("Error reading or parsing Datasets file: " + filePath, e);
        }
    }

    public void processEgoPoses(String filePath) {
        try {
            List<EgoPoseDto> egoPoses = readDataFromFile(filePath, new TypeReference<>() {
            });
            DataStorage.getInstance().storeEgoPoses(egoPoses);
            logger.info("reading  ego_pose.json file .... : " + filePath);
        } catch (IOException e) {
            logger.error("Error reading or parsing EgoPoses file: " + filePath, e);
        }
    }

    public void processFrameAnnotations(String filePath) {
        try {
            List<FrameAnnotationDto> frameAnnotations = readDataFromFile(filePath, new TypeReference<>() {
            });
            DataStorage.getInstance().storeFrameAnnotations(frameAnnotations);
            logger.info("reading  frame_annotation.json file .... : " + filePath);
        } catch (IOException e) {
            logger.error("Error reading or parsing FrameAnnotations file: " + filePath, e);
        }
    }

    public void processFrameDatas(String filePath) {
        try {
            List<FrameDataDto> frameDatas = readDataFromFile(filePath, new TypeReference<>() {
            });
            DataStorage.getInstance().storeFrameDatas(frameDatas);
            logger.info("reading  frame_data.json file .... : " + filePath);
        } catch (IOException e) {
            logger.error("Error reading or parsing FrameDatas file: " + filePath, e);
        }
    }

    public void processFrames(String filePath) {
        try {
            List<FrameDto> frames = readDataFromFile(filePath, new TypeReference<>() {
            });
            DataStorage.getInstance().storeFrames(frames);
            logger.info("reading  frame.json file .... : " + filePath);
        } catch (IOException e) {
            logger.error("Error reading or parsing Frames file: " + filePath, e);
        }
    }

    public void processInstances(String filePath) {
        try {
            List<InstanceDto> instances = readDataFromFile(filePath, new TypeReference<>() {
            });
            DataStorage.getInstance().storeInstances(instances);
            logger.info("reading  instance.json file .... : " + filePath);
        } catch (IOException e) {
            logger.error("Error reading or parsing Instances file: " + filePath, e);
        }
    }

    public void processLogs(String filePath) {
        try {
            List<LogDto> logs = readDataFromFile(filePath, new TypeReference<>() {
            });
            DataStorage.getInstance().storeLogs(logs);
            logger.info("reading  log.json file .... : " + filePath);
        } catch (IOException e) {
            logger.error("Error reading or parsing Logs file: " + filePath, e);
        }
    }

    public void processPresets(String filePath) {
        try {
            PresetDto presets = readDataFromFile(filePath, new TypeReference<>() {
            });
            DataStorage.getInstance().storePresets(presets);
            logger.info("reading  preset.json file .... : " + filePath);
        } catch (IOException e) {
            logger.error("Error reading or parsing Presets file: " + filePath, e);
        }
    }

    public void processSensors(String filePath) {
        try {
            List<SensorDto> sensors = readDataFromFile(filePath, new TypeReference<>() {
            });
            DataStorage.getInstance().storeSensors(sensors);
            logger.info("reading  sensor.json file .... : " + filePath);
        } catch (IOException e) {
            logger.error("Error reading or parsing Sensors file: " + filePath, e);
        }
    }


    private <T> T readDataFromFile(String filePath, TypeReference<T> typeReference) throws IOException {
        String fileContent = new String(Files.readAllBytes(new File(filePath).toPath()));
        return objectMapper.readValue(fileContent, typeReference);
    }
}