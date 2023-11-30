package com.ns21.common.mist.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns21.common.mist.dto.*;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class UuidMatching {

    public static List<String> UuidPut() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<String> UuidList = new ArrayList<>();

        // Retrieve data from DataStorage
        List<DatasetDto> datasetList = DataStorage.getInstance().getDatasets();
        List<EgoPoseDto> egoPoseList = DataStorage.getInstance().getEgoPoses();
        List<FrameDto> frameList = DataStorage.getInstance().getFrames();
        List<FrameAnnotationDto> frameAnnotationList = DataStorage.getInstance().getFrameAnnotations();
        List<InstanceDto> instanceList = DataStorage.getInstance().getInstances();
        List<LogDto> logList = DataStorage.getInstance().getLogs();
        List<SensorDto> sensorList = DataStorage.getInstance().getSensors();
        List<FrameDataDto> frameDataList = DataStorage.getInstance().getFrameData();

        // Create maps for quick UUID lookup
        Map<String, DatasetDto> datasetMap = createMapFromList(datasetList);
        Map<String, EgoPoseDto> egoPoseMap = createMapFromList(egoPoseList);
        Map<String, FrameDto> frameMap = createMapFromList(frameList);
        Map<String, InstanceDto> instanceMap = createMapFromList(instanceList);
        Map<String, LogDto> logMap = createMapFromList(logList);
        Map<String, SensorDto> sensorMap = createMapFromList(sensorList);

        for (FrameDataDto frameData : frameDataList) {
            EgoPoseDto egoPose = egoPoseMap.get(frameData.getEgoPoseUuid());
            SensorDto sensor = sensorMap.get(frameData.getSensorUuid());
            FrameDto frame = frameMap.get(frameData.getFrameUuid());

            if (frame != null) {
                DatasetDto dataset = datasetMap.get(frame.getDatasetUuid());
                LogDto log = logMap.get(dataset.getLogUuid());

                List<FrameAnnotationDto> relevantFrameAnnotations = frameAnnotationList.stream()
                        .filter(fa -> fa.getFrameDataUuid().equals(frameData.getUuid()))
                        .toList();

                for (FrameAnnotationDto frameAnnotation : relevantFrameAnnotations) {
                    InstanceDto instance = instanceMap.get(frameAnnotation.getInstanceUuid());

                    if (egoPose != null && sensor != null && log != null && instance != null) {
                        Map<String, Object> uuid = new LinkedHashMap<>();
                        uuid.put("datasetUuid", dataset.getUuid());
                        uuid.put("egoPoseUuid", egoPose.getUuid());
                        uuid.put("sensorUuid", sensor.getUuid());
                        uuid.put("frameUuid", frame.getUuid());
                        uuid.put("frameDataUuid", frameData.getUuid());
                        uuid.put("frameAnnotationUuid", frameAnnotation.getUuid());
                        uuid.put("instanceUuid", instance.getUuid());
                        uuid.put("logUuid", log.getUuid());

                        UuidList.add(mapper.writeValueAsString(uuid));
                    }
                }
            }
        }
        return UuidList;
    }

    private static <T extends BaseDto> Map<String, T> createMapFromList(List<T> list) {
        return list.stream().collect(Collectors.toMap(T::getUuid, Function.identity(), (a, b) -> a));
    }
}
