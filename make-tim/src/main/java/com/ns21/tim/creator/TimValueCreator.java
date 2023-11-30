package com.ns21.tim.creator;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns21.common.mist.dto.*;
import com.ns21.common.mist.parser.DataStorage;
import com.ns21.common.util.MetaDataConvertUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;

import static com.ns21.common.util.MetaDataConvertUtil.minuteOfTheYear;

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
public class TimValueCreator {
    private static final Logger logger = LoggerFactory.getLogger(TimValueCreator.class);
    // 클래스 레벨 변수로 msgCnt 추가
    private static int msgCnt = 0;

    public static String createTimMessage() throws IOException {
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
        Map<String, Object> timMessage = new LinkedHashMap<>();

        // EgoPoseDto 객체에서 타임스탬프 가져와서 타임스탬프를 연도와 시간으로 변환
        int[] convertedTimestamp = MetaDataConvertUtil.convertTimestamp(egoPoseDto.getTimestamp());
        // EgoPoseDto 객체에서 translation 가져와서 translation를 위경고도로 변환
        List<Double> translation = egoPoseDto.getTranslation();
        double utmX = translation.get(0); // ex)326865.27824246883
        double utmY = translation.get(1); // ex)4147694.5101196766
        int utmZone = 52; //대한민국 대부분 지역은 52 (일부51)
        double elevation = translation.get(2); // ex)49.126053147017956
        long[] utmToLatLon = MetaDataConvertUtil.utmToLatLon(utmX, utmY, utmZone, elevation);
        // EgoPoseDto 객체에서 로테이션 가져와서 다이렉션으로 변환
        String direction = MetaDataConvertUtil.quaternionToFormattedString(egoPoseDto.getRotation());
        //timestamp 값 분 단위,integer 타입, 527040 범위 안으로 변경하여 가져오기
        int integerTimestamp = minuteOfTheYear(egoPoseDto.getTimestamp());

        // Add msgCnt
        timMessage.put("msgCnt", msgCnt++);
        timMessage.put("timeStamp", integerTimestamp); //egoPoseDto.getTimestamp() timestamp 값 inteager 값으로 맞추기
        // Add dataFrames
        List<Map<String, Object>> dataFrames = new ArrayList<>();
        Map<String, Object> dataFrame = new LinkedHashMap<>();
        dataFrame.put("sspTimRights", 0);
        dataFrame.put("frameType", "advisory");
        dataFrame.put("msgId", Map.of("furtherInfoID", "0000"));

        // 변환된 연도와 시간을 dataFrame에 넣기
        dataFrame.put("startYear", convertedTimestamp[0]); //ego_pose.json 의 타임스탬프, 에고 포즈가 기록된 시점
        dataFrame.put("startTime", convertedTimestamp[1]); //ego_pose.json 의 타임스탬프, 에고 포즈가 기록된 시점

        dataFrame.put("duratonTime", 0);
        dataFrame.put("priority", 02);
        dataFrame.put("sspLocationRights", 0);

        // Add regions
        List<Map<String, Object>> regions = new ArrayList<>();
        Map<String, Object> region = new LinkedHashMap<>();
        Map<String, Object> anchor = new LinkedHashMap<>();

        // Replace with actual data
        anchor.put("lat", utmToLatLon[0]); //ego_pose.json 의 translation, 공간에서 차량의 위치
        anchor.put("long", utmToLatLon[1]); //ego_pose.json 의 translation, 공간에서 차량의 위치
        anchor.put("elevation", utmToLatLon[2]); //ego_pose.json 의 translation, //공간에서 차량의 위치
        region.put("anchor", anchor);

        Map<String, Object> description = new LinkedHashMap<>();
        Map<String, Object> path = new LinkedHashMap<>();
        Map<String, Object> offset = new LinkedHashMap<>();
        Map<String, Object> ll = new LinkedHashMap<>();
        List<Map<String, Object>> nodes = new ArrayList<>();

        // 첫 번째 노드 생성
        Map<String, Object> node1 = new LinkedHashMap<>();
        Map<String, Object> delta1 = new LinkedHashMap<>();
        Map<String, Object> nodeLatLon1 = new LinkedHashMap<>();
        nodeLatLon1.put("lon", utmToLatLon[1]); //ego_pose.json 의 translation(일단은 기존과 같은 위치)
        nodeLatLon1.put("lat", utmToLatLon[0]); //ego_pose.json 의 translation(일단은 기존과 같은 위치)
        delta1.put("node-LatLon", nodeLatLon1);
        node1.put("delta", delta1);

        // 두 번째 노드 생성
        Map<String, Object> node2 = new LinkedHashMap<>();
        Map<String, Object> delta2 = new LinkedHashMap<>();
        Map<String, Object> nodeLatLon2 = new LinkedHashMap<>();
        nodeLatLon2.put("lon", utmToLatLon[1]); //ego_pose.json 의 translation(일단은 기존과 같은 위치)
        nodeLatLon2.put("lat", utmToLatLon[0]); //ego_pose.json 의 translation(일단은 기존과 같은 위치)
        delta2.put("node-LatLon", nodeLatLon2);
        node2.put("delta", delta2);

        // 노드들을 nodes 리스트에 추가
        nodes.add(node1);
        nodes.add(node2);


        ll.put("nodes", nodes);
        offset.put("ll", ll);
        path.put("offset", offset);
        description.put("path", path);
        region.put("direction", direction); //ego_pose.json 의 rotation  공간에서 차량의 방향을 나타냄
        region.put("description", description);
        regions.add(region);

        dataFrame.put("regions", regions);

        // Add sspMsgRights
        dataFrame.put("sspMsgRights1", 0);
        dataFrame.put("sspMsgRights2", 0);

        // Add content
        Map<String, Object> content = new LinkedHashMap<>();
        List<Map<String, Object>> advisory = new ArrayList<>();
        Map<String, Object> itemWrapper = new LinkedHashMap<>();
        Map<String, String> item = new LinkedHashMap<>();

        // instance.json 의 category_name , frame_annotation.json 의  vehicle_state ,  dataset.json 의 scenario_names, frameannotation의 visibility_level 차량종류,차량상태,배경상황,가시성레벨
        String textValue = instanceDto.getCategoryName() + ", " + frameAnnotationDto.getAttribute().get("vehicle_state") + ", " + datasetDto.getScenarioNames() + ", " + frameAnnotationDto.getVisibilityLevel(); // category_name 과 vehicle_state 값을 합쳐서 item 에 put

        item.put("text", textValue);
        itemWrapper.put("item", item);
        advisory.add(itemWrapper);
        content.put("advisory", advisory);
        dataFrame.put("content", content);

        dataFrames.add(dataFrame);
        timMessage.put("dataFrames", dataFrames);

        // Add regional
        List<Map<String, Object>> regional = new ArrayList<>();
        Map<String, Object> regionalItem = new LinkedHashMap<>();
        regionalItem.put("regionId", 4);

        Map<String, Object> regExtValue = new LinkedHashMap<>();
        List<Map<String, Object>> cits = new ArrayList<>();
        Map<String, Object> cit = new LinkedHashMap<>();

        // Assuming scenarioNames is a List<String> and sensorName is a String
        List<String> sensorName = Collections.singletonList(sensorDto.getName());
        // Now put this combined list in 'cit'
        cit.put("text", sensorName);  // sensor.json 의 name  어떤 장비로 인지 하였는지
        cit.put("subtext", Arrays.asList(frameDataDto.getUuid())); //frameData.json 의 uuid
        cit.put("stopID", logDto.getLocation()); // log.json 의 location //로그가 캡처된 위치/명칭
        cits.add(cit);
        regExtValue.put("cits", cits);
        regionalItem.put("regExtValue", regExtValue);
        regional.add(regionalItem);

        timMessage.put("regional", regional);

        return mapper.writeValueAsString(timMessage);
    }
}
