package com.ns21.rsa.creator;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns21.common.mist.parser.DataStorage;
import com.ns21.common.mist.dto.*;
import com.ns21.common.util.MetaDataConvertUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;

import static com.ns21.common.util.MetaDataConvertUtil.*;

/**
 * packageName    : com.ns21.rsa.creator
 * fileName       : RsaMessageCreator.java
 * author         : kjg08
 * date           : 2023-11-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-24        kjg08           최초 생성
 */
public class RsaValueCreator {
    private static final Logger logger = LoggerFactory.getLogger(RsaValueCreator.class);
    // 클래스 레벨 변수로 msgCnt 추가
    private static int msgCnt = 0;

    public static String createRsaMessage() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // DataStorage에서 데이터 가져오기
        List<EgoPoseDto> egoPoseList = DataStorage.getInstance().getEgoPoses();
        List<FrameAnnotationDto> frameAnnotationList = DataStorage.getInstance().getFrameAnnotations();
        List<LogDto> logList = DataStorage.getInstance().getLogs();
        List<SensorDto> sensorList = DataStorage.getInstance().getSensors();
        List<InstanceDto> instanceDtoList = DataStorage.getInstance().getInstances();
        List<FrameDataDto> frameDataDtoList = DataStorage.getInstance().getFrameData();

        // 데이터가 있는 경우에만
        EgoPoseDto egoPoseDto = egoPoseList.isEmpty() ? null : egoPoseList.get(0);
        FrameAnnotationDto frameAnnotationDto = frameAnnotationList.isEmpty() ? null : frameAnnotationList.get(0);
        LogDto logDto = logList.isEmpty() ? null : logList.get(0);
        SensorDto sensorDto = sensorList.isEmpty() ? null : sensorList.get(0);
        InstanceDto instanceDto = instanceDtoList.isEmpty() ? null : instanceDtoList.get(0);
        FrameDataDto frameDataDto = frameDataDtoList.isEmpty() ? null : frameDataDtoList.get(0);

        // Construct the JSON message
        Map<String, Object> rsaMessage = new LinkedHashMap<>();

        // EgoPoseDto 객체에서 translation 가져와서 translation를 위경고도로 변환
        List<Double> translation = egoPoseDto.getTranslation();
        double utmX = translation.get(0); // ex)326865.27824246883
        double utmY = translation.get(1); // ex)4147694.5101196766
        int utmZone = 52; //대한민국 대부분 지역은 52 (일부51)
        double elevation = translation.get(2); // ex)49.126053147017956
        long[] utmToLatLon = MetaDataConvertUtil.utmToLatLon(utmX, utmY, utmZone, elevation);

        //timestamp 값 분 단위,integer 타입, 527040 범위 안으로 변경하여 가져오기
        int integerTimestamp = minuteOfTheYear(egoPoseDto.getTimestamp());
        // Add msgCnt
        rsaMessage.put("msgCnt", msgCnt++);
        rsaMessage.put("timeStamp", integerTimestamp);
        rsaMessage.put("typeEvent", 0); // todo : 주의할 차량과 차량의 이동상태,가시성 낮음 추가해야함 itis 코드를 이용하여 로직 추가해야함 instance.json 의 category_name , frame_annotation.json 의  vehicle_state , frameannotation의 visibility_level
        rsaMessage.put("priority", "01");

        // sensor.json 의 rotation 값을 quaternionToHeading 를 통해 변환함 (ffff)
        String heading = MetaDataConvertUtil.quaternionToHeading(sensorDto.getRotation());
        rsaMessage.put("heading", heading); //sensor.json 의 rotation

        Map<String, Object> position = new LinkedHashMap<>();
        // timestamp 를 utctime 으로 변환 > convertTimestampToUtcMap
        Map<String, Object> utcTimeMap = convertTimestampToUtcMap(egoPoseDto.getTimestamp());
        position.put("utcTime", utcTimeMap); //ego_pose.json 의 timestamp, //에고 포즈가 기록된 시점

        position.put("long", utmToLatLon[1]);  // ego_pose.json 파일의 translation,
        position.put("lat", utmToLatLon[0]);  // ego_pose.json 파일의 translation,
        position.put("elevation", utmToLatLon[2]);  // ego_pose.json 파일의 translation,
        rsaMessage.put("position", position);

        List<Map<String, Object>> regional = new ArrayList<>();
        Map<String, Object> regionalItem = new LinkedHashMap<>();
        regionalItem.put("regionId", 4);

        Map<String, Object> regExtValue = new LinkedHashMap<>();
        Map<String, Object> cits = new LinkedHashMap<>();
        cits.put("stopID", logDto.getLocation()); //log.json 의 location 로그가 캡처된 위치/명칭
        cits.put("text", frameDataDto.getUuid()); //frameData.json 의 uuid
        cits.put("sendUniqueId", sensorDto.getName()); //sensor.json 의 name // 어떤 장비로 인지 하였는지


        regExtValue.put("cits", cits);
        regionalItem.put("regExtValue", regExtValue);
        regional.add(regionalItem);

        rsaMessage.put("regional", regional);

        return mapper.writeValueAsString(rsaMessage);
    }
}
