package com.ns21.common.mist.parser;

import com.ns21.common.mist.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class DataStorage {
    private static final Logger logger = LoggerFactory.getLogger(DataStorage.class);
    private static final DataStorage instance = new DataStorage();
    private final ConcurrentHashMap<String, Object> dataMap;

    private DataStorage() {
        dataMap = new ConcurrentHashMap<>();
    }

    public static DataStorage getInstance() {
        return instance;
    }


    // DatasetDto 저장 및 조회
    public void storeDatasets(List<DatasetDto> datasets) {
        dataMap.put("datasets", datasets);
    }

    @SuppressWarnings("unchecked")
    public List<DatasetDto> getDatasets() {
        return (List<DatasetDto>) dataMap.get("datasets");
    }

    // EgoPoseDto 저장 및 조회
    public void storeEgoPoses(List<EgoPoseDto> egoPoses) {
        dataMap.put("egoPoses", egoPoses);
    }
    @SuppressWarnings("unchecked")
    public List<EgoPoseDto> getEgoPoses() {
        return (List<EgoPoseDto>) dataMap.get("egoPoses");

    }

    // FrameAnnotationDto 저장 및 조회
    public void storeFrameAnnotations(List<FrameAnnotationDto> annotations) {
        dataMap.put("frameAnnotations", annotations);
    }

    @SuppressWarnings("unchecked")
    public List<FrameAnnotationDto> getFrameAnnotations() {
        return (List<FrameAnnotationDto>) dataMap.get("frameAnnotations");
    }

    // FrameDataDto 저장 및 조회
    public void storeFrameDatas(List<FrameDataDto> frameData) {
        dataMap.put("frameData", frameData);
    }

    @SuppressWarnings("unchecked")
    public List<FrameDataDto> getFrameData() {
        return (List<FrameDataDto>) dataMap.get("frameData");
    }

    // FrameDto 저장 및 조회
    public void storeFrames(List<FrameDto> frames) {
        dataMap.put("frames", frames);
    }

    @SuppressWarnings("unchecked")
    public List<FrameDto> getFrames() {
        return (List<FrameDto>) dataMap.get("frames");
    }

    // InstanceDto 저장 및 조회
    public void storeInstances(List<InstanceDto> instances) {
        dataMap.put("instances", instances);
    }

    @SuppressWarnings("unchecked")
    public List<InstanceDto> getInstances() {
        return (List<InstanceDto>) dataMap.get("instances");
    }

    // LogDto 저장 및 조회
    public void storeLogs(List<LogDto> logs) {
        dataMap.put("logs", logs);
    }

    @SuppressWarnings("unchecked")
    public List<LogDto> getLogs() {
        return (List<LogDto>) dataMap.get("logs");
    }

    // PresetDto 저장 및 조회
    public void storePresets(PresetDto preset) {
        dataMap.put("preset", preset);
    }

    public PresetDto getPreset() {
        return (PresetDto) dataMap.get("preset");
    }

    // SensorDto 저장 및 조회
    public void storeSensors(List<SensorDto> sensors) {
        dataMap.put("sensors", sensors);
    }

    @SuppressWarnings("unchecked")
    public List<SensorDto> getSensors() {
        return (List<SensorDto>) dataMap.get("sensors");
    }
}
