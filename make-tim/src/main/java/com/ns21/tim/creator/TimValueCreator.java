package com.ns21.tim.creator;


import ch.qos.logback.core.joran.sanity.Pair;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns21.common.mist.dto.*;
import com.ns21.common.util.MetaDataConvertUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;

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

    public static String createTimMessage(DatasetDto datasetDto, EgoPoseDto egoPoseDto, FrameAnnotationDto frameAnnotationDto, LogDto logDto, PresetDto presetDto, SensorDto sensorDto) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        int i = 0;
        // Construct the JSON message
        Map<String, Object> timMessage = new LinkedHashMap<>();

        //  EgoPoseDto 객체에서 타임스탬프 가져와서 타임스탬프를 연도와 시간으로 변환
        // String timestamp = egoPoseDto.getTimestamp();
        // String[] convertedTimestamp = MetaDataConvertUtil.convertTimestamp(timestamp);

        // Add msgCnt
        timMessage.put("msgCnt", i++);

        // Add dataFrames
        List<Map<String, Object>> dataFrames = new ArrayList<>();
        Map<String, Object> dataFrame = new LinkedHashMap<>();
        dataFrame.put("sspTimRights", 0);
        dataFrame.put("frameType", "advisory");
        dataFrame.put("msgId", Map.of("furtherInfoID", "0000"));

        // 변환된 연도와 시간을 dataFrame에 넣기
        //  dataFrame.put("startYear", convertedTimestamp[0]);
        //  dataFrame.put("startTime", convertedTimestamp[1]);

        dataFrame.put("duratonTime", 0);
        dataFrame.put("priority", 0);
        dataFrame.put("sspLocationRights", 0);

        // Add regions
        List<Map<String, Object>> regions = new ArrayList<>();
        Map<String, Object> region = new LinkedHashMap<>();
        Map<String, Object> anchor = new LinkedHashMap<>();
        // Replace with actual data
        anchor.put("lat", "REPLACE_WITH_LATITUDE");
        anchor.put("long", "REPLACE_WITH_LONGITUDE");
        anchor.put("elevation", "REPLACE_WITH_ELEVATION");
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
        nodeLatLon1.put("lon", "REPLACE_WITH_LON_1");
        nodeLatLon1.put("lat", "REPLACE_WITH_LAT_1");
        delta1.put("node-LatLon", nodeLatLon1);
        node1.put("delta", delta1);

        // 두 번째 노드 생성
        Map<String, Object> node2 = new LinkedHashMap<>();
        Map<String, Object> delta2 = new LinkedHashMap<>();
        Map<String, Object> nodeLatLon2 = new LinkedHashMap<>();
        nodeLatLon2.put("lon", "REPLACE_WITH_LON_2");
        nodeLatLon2.put("lat", "REPLACE_WITH_LAT_2");
        delta2.put("node-LatLon", nodeLatLon2);
        node2.put("delta", delta2);

        // 노드들을 nodes 리스트에 추가
        nodes.add(node1);
        nodes.add(node2);


        ll.put("nodes", nodes);
        offset.put("ll", ll);
        path.put("offset", offset);
        description.put("path", path);
        region.put("direction", "ego_pose.json rotation");
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

        // Replace with actual data
        item.put("itis", "REPLACE_WITH_ITIS");
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
        // Replace with actual data
        cit.put("text", Arrays.asList("REPLACE_WITH_UUID", "REPLACE_WITH_SCENARIO_NAMES", "REPLACE_WITH_SENSOR_NAME", "REPLACE_WITH_VEHICLE_STATE"));
        cit.put("subtext", Arrays.asList("REPLACE_WITH_VALUE", "REPLACE_WITH_VALUE-VALUE"));
        cit.put("stopID", "REPLACE_WITH_LOCATION");
        cits.add(cit);
        regExtValue.put("cits", cits);
        regionalItem.put("regExtValue", regExtValue);
        regional.add(regionalItem);

        timMessage.put("regional", regional);

        return mapper.writeValueAsString(timMessage);
    }
}
