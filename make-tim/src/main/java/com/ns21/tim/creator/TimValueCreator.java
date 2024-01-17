package com.ns21.tim.creator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns21.common.itis.ItisCodeMapper;
import com.ns21.common.mist.parser.UuidMatching;
import com.ns21.common.util.MetaDataConvertUtil;

import java.io.IOException;
import java.util.*;

import static com.ns21.common.util.MetaDataConvertUtil.minuteOfTheYear;

/**
 * packageName    : com.ns21.tim.creator
 * fileName       : TimMessageCreator.java
 * author         : kjg08
 * date           : 2023-11-24
 * description    : JSON 처리 및 열거형과 코덱 처리
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-24        kjg08           최초 생성
 */
public class TimValueCreator {

    private static final int UTM_ZONE = 52; // Assuming this is a constant
    private static final ObjectMapper mapper = new ObjectMapper();
    private static int msgCnt = 0;

    public static List<String> createTimMessage() throws IOException {
        List<String> messages = new ArrayList<>();
        // UuidMatching 클래스를 사용하여 관련된 데이터의 JSON 문자열을 가져옵니다.
        List<String> relatedUuids = UuidMatching.UuidPut();
        //  relatedUuids에는 연관된 데이터의 JSON 문자열이 포함되어 있습니다.
        for (String uuidJson : relatedUuids) {
            try {
                // JSON 문자열을 Map 객체로 변환합니다.
                Map<String, Object> uuidMap = mapper.readValue(uuidJson, new TypeReference<>() {
                });
                // Construct the JSON message
                Map<String, Object> timMessage = new LinkedHashMap<>();

                //timestamp 값 분 단위,integer 타입, 527040 범위 안으로 변경하여 가져오기
                String timestampStr = String.valueOf(uuidMap.get("egoPose_timestamp"));
                long timestamp = (long) Double.parseDouble(timestampStr);
                int minutesOfYear = minuteOfTheYear(Long.toString(timestamp));

                // egoPose_timestamp 에서 가져온  timestampStr 가져와서 연도와 시간으로 변환
                int[] convertedTimestamp = MetaDataConvertUtil.convertTimestamp(timestampStr);

                // EgoPoseDto 객체에서 translation 가져와서 translation를 위경고도로 변환
                if (uuidMap.get("egoPose_translation") instanceof List) {
                    @SuppressWarnings("unchecked")
                    List<Double> translation = (List<Double>) uuidMap.get("egoPose_translation");
                    double utmX = translation.get(0); // ex)326865.27824246883
                    double utmY = translation.get(1); // ex)4147694.5101196766
                    double elevation = translation.get(2); // ex)49.126053147017956
                    long[] utmToLatLon = MetaDataConvertUtil.CoordinateConverter.utmToLatLon(utmX, utmY, UTM_ZONE, elevation);
                    // EgoPoseDto 객체에서 로테이션 가져와서 다이렉션으로 변환
                    if (uuidMap.get("egoPose_rotation") instanceof List) {
                        @SuppressWarnings("unchecked")
                        String direction = MetaDataConvertUtil.quaternionToFormattedString((List<Double>) uuidMap.get("egoPose_rotation"));

                        // 공통 필드를 추가합니다.
                        timMessage.put("msgCnt", msgCnt);
                        msgCnt = (msgCnt + 1) % 128;  // msgCnt가 127을 넘지 않도록 함
                        timMessage.put("timeStamp", minutesOfYear); //egoPoseDto.getTimestamp() timestamp 값 inteager 값으로 맞추기
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
                        dataFrame.put("priority", 2);
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

                        // instance.json 의 category_name , frame_annotation.json 의 vehicle_state ,  dataset.json 의 scenario_names 차량종류,차량상태,배경상황
                        String categoryName = uuidMap.containsKey("instance_categoryName") ? (String) uuidMap.get("instance_categoryName") : "0";
                        String vehicleState = uuidMap.containsKey("frameAnnotation_attribute") && uuidMap.get("frameAnnotation_attribute") != null
                                ? (String) ((Map<String, Object>) uuidMap.get("frameAnnotation_attribute")).get("vehicle_state") : "0";

                        // ITIS 코드를 저장할 로컬 변수 선언
                        Integer categoryCode = null;
                        Integer vehicleStateCode = null;

                        // categoryName에 대한 ITIS 코드 추가
                        if (categoryName != null && !categoryName.equals("0")) {
                            categoryCode = ItisCodeMapper.getCategoryITISCode(categoryName);
                            if (categoryCode != null) {
                                Map<String, Object> itemWrapper = new LinkedHashMap<>();
                                Map<String, Object> item = new LinkedHashMap<>();
                                item.put("itis", categoryCode);
                                itemWrapper.put("item", item);
                                advisory.add(itemWrapper);
                            }
                        }

                        // vehicleState에 대한 ITIS 코드 추가
                        if (vehicleState != null && !vehicleState.equals("0")) {
                            vehicleStateCode = ItisCodeMapper.getAttributeITISCode(vehicleState);
                            if (vehicleStateCode != null) {
                                Map<String, Object> itemWrapper = new LinkedHashMap<>();
                                Map<String, Object> item = new LinkedHashMap<>();
                                item.put("itis", vehicleStateCode);
                                itemWrapper.put("item", item);
                                advisory.add(itemWrapper);
                            }
                        }
                        if((vehicleState == null || vehicleState.equals("0")) && (categoryName == null || categoryName.equals("0"))){
                            continue;
                        }
                        // categoryName과 vehicleState가 유효한 값인지 확인
                        if ((categoryCode == null || categoryCode.equals("0")) &&
                                (vehicleStateCode == null || vehicleStateCode.equals("0"))) {
                            continue; // 유효하지 않은 경우, 메시지 생성을 건너뛰고 다음 반복으로 넘어감
                        }


                        // scenarioNames 처리
                        StringBuilder textBuilder = new StringBuilder();
                        Object scenarioNamesObj = uuidMap.get("dataset_scenarioNames");
                        if (scenarioNamesObj instanceof List) {
                            @SuppressWarnings("unchecked")
                            List<String> scenarioNamesList = (List<String>) scenarioNamesObj;
                            String scenarioNames = String.join(", ", scenarioNamesList);
                            textBuilder.append(scenarioNames);
                        }

                        String textValue = textBuilder.toString();
                        if (!textValue.isEmpty()) {
                            Map<String, Object> textItemWrapper = new LinkedHashMap<>();
                            Map<String, String> textItem = new LinkedHashMap<>();
                            textItem.put("text", textValue);
                            textItemWrapper.put("item", textItem);
                            advisory.add(textItemWrapper);
                        }

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
                        List<String> sensorName = Collections.singletonList(String.valueOf(uuidMap.get("sensor_name")));
                        // Now put this combined list in 'cit'
                        cit.put("stopID", uuidMap.get("log_location")); // log.json 의 location //로그가 캡처된 위치/명칭
                        cit.put("text", Collections.singletonList(uuidMap.get("frameData_uuid"))); //frameData.json 의 uuid
                        cit.put("subtext", sensorName);  // sensor.json 의 name  어떤 장비로 인지 하였는지

                        cits.add(cit);
                        regExtValue.put("cits", cits);

                        regionalItem.put("regExtValue", regExtValue);
                        regional.add(regionalItem);

                        timMessage.put("regional", regional);

                        messages.add(mapper.writeValueAsString(timMessage));
                    }
                }
            } catch (JsonProcessingException e) {
                System.err.println("JSON 처리 중 오류 발생: " + e.getMessage() + " in JSON: " + uuidJson);
            } catch (ClassCastException e) {
                System.err.println("데이터 형변환 중 오류 발생: " + e.getMessage() + " in JSON: " + uuidJson);
            } catch (Exception e) {
                System.err.println("Unexpected error processing JSON: " + uuidJson + ", Error: " + e.getMessage());
            }
        }
        return messages;
    }
}
