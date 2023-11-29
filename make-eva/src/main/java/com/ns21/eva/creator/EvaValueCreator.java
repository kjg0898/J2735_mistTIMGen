package com.ns21.eva.creator;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns21.common.mist.dto.*;
import com.ns21.common.mist.parser.DataStorage;
import com.ns21.common.util.MetaDataConvertUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.ns21.common.util.MetaDataConvertUtil.convertTimestampToUtcMap;

/**
 * packageName    : com.ns21.eva.creator
 * fileName       : EvaMessageCreator.java
 * author         : kjg08
 * date           : 2023-11-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-24        kjg08           최초 생성
 */
public class EvaValueCreator {
    private static final Logger logger = LoggerFactory.getLogger(EvaValueCreator.class);
    // 클래스 레벨 변수로 msgCnt 추가
    private static int msgCnt = 0;

    public static String createEvaMessage() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // DataStorage에서 데이터 가져오기
        List<DatasetDto> datasetList = DataStorage.getInstance().getDatasets();
        List<EgoPoseDto> egoPoseList = DataStorage.getInstance().getEgoPoses();
        List<FrameAnnotationDto> frameAnnotationList = DataStorage.getInstance().getFrameAnnotations();
        List<LogDto> logList = DataStorage.getInstance().getLogs();
        List<SensorDto> sensorList = DataStorage.getInstance().getSensors();
        List<InstanceDto> instanceDtoList = DataStorage.getInstance().getInstances();
        List<FrameDataDto> frameDataDtoList = DataStorage.getInstance().getFrameData();

        // 데이터가 있는 경우에만
        DatasetDto datasetDto = datasetList.isEmpty() ? null : datasetList.get(0);
        EgoPoseDto egoPoseDto = egoPoseList.isEmpty() ? null : egoPoseList.get(0);
        FrameAnnotationDto frameAnnotationDto = frameAnnotationList.isEmpty() ? null : frameAnnotationList.get(0);
        LogDto logDto = logList.isEmpty() ? null : logList.get(0);
        SensorDto sensorDto = sensorList.isEmpty() ? null : sensorList.get(0);
        InstanceDto instanceDto = instanceDtoList.isEmpty() ? null : instanceDtoList.get(0);
        FrameDataDto frameDataDto = frameDataDtoList.isEmpty() ? null : frameDataDtoList.get(0);

        // Construct the JSON message
        Map<String, Object> evaMessage = new LinkedHashMap<>();

        // EgoPoseDto 객체에서 translation 가져와서 translation를 위경고도로 변환
        List<Double> translation = egoPoseDto.getTranslation();
        double utmX = translation.get(0); // ex)326865.27824246883
        double utmY = translation.get(1); // ex)4147694.5101196766
        int utmZone = 52; //대한민국 대부분 지역은 52 (일부51)
        double elevation = translation.get(2); // ex)49.126053147017956
        long[] utmToLatLon = MetaDataConvertUtil.utmToLatLon(utmX, utmY, utmZone, elevation);

        // Add msgCnt
        evaMessage.put("msgCnt", msgCnt++);
        evaMessage.put("typeEvent", 0); // todo : 주변 차량과 이동상태,가시성 낮음 추가해야함 itis 코드를 이용하여 로직 추가해야함
        evaMessage.put("priority", "01");

        // sensor.json 의 rotation 값을 quaternionToHeading 를 통해 변환함 (ffff)
        String heading = MetaDataConvertUtil.quaternionToHeading(sensorDto.getRotation());
        evaMessage.put("heading", heading);

        Map<String, Object> position = new LinkedHashMap<>();
        // timestamp 를 utctime 으로 변환 > convertTimestampToUtcMap
        Map<String, Object> utcTimeMap = convertTimestampToUtcMap(egoPoseDto.getTimestamp());
        position.put("utcTime", utcTimeMap);

        position.put("long", utmToLatLon[1]);
        position.put("lat", utmToLatLon[0]);
        position.put("elevation", utmToLatLon[2]);
        evaMessage.put("position", position);

        List<Map<String, Object>> regional = new ArrayList<>();
        Map<String, Object> regionalItem = new LinkedHashMap<>();
        regionalItem.put("regionId", 4);

        Map<String, Object> regExtValue = new LinkedHashMap<>();
        Map<String, Object> cits = new LinkedHashMap<>();
        cits.put("stopID", logDto.getLocation());
        cits.put("text", frameDataDto.getUuid());
        cits.put("sendUniqueId", sensorDto.getName());


        regExtValue.put("cits", cits);
        regionalItem.put("regExtValue", regExtValue);
        regional.add(regionalItem);

        evaMessage.put("regional", regional);

        return mapper.writeValueAsString(evaMessage);
    }
}
