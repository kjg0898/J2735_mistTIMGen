package com.ns21.common.mist.parser;

import com.ns21.common.mist.dto.*;
import lombok.Getter;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/**
 * fileName       : DataStorage.java
 * author         : kjg08
 * date           : 2023-11-23
 * description    :데이터 저장소를 관리하고, 데이터를 저장하기 위해 ConcurrentHashMap을 사용하며, 스레드 안전에 중점
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-23        kjg08           최초 생성
 */
public class DataStorage {
    @Getter
    private static final DataStorage instance = new DataStorage();
    private final ConcurrentHashMap<String, Object> dataMap;

    private DataStorage() {
        dataMap = new ConcurrentHashMap<>();
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

   // public PresetDto getPreset() {
   //     return (PresetDto) dataMap.get("preset");
   // }

    // SensorDto 저장 및 조회
    public void storeSensors(List<SensorDto> sensors) {
        dataMap.put("sensors", sensors);
    }

    @SuppressWarnings("unchecked")
    public List<SensorDto> getSensors() {
        return (List<SensorDto>) dataMap.get("sensors");
    }
}
