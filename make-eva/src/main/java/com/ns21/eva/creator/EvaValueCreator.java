package com.ns21.eva.creator;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns21.common.mist.dto.*;
import com.ns21.common.mist.parser.UuidMatching;
import com.ns21.common.util.MetaDataConvertUtil;

import java.io.IOException;
import java.util.*;

import static com.ns21.common.util.MetaDataConvertUtil.*;

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
    private static int msgCnt = 0;

    public static String createEvaMessage() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // UuidMatching 클래스를 사용하여 관련된 데이터의 JSON 문자열을 가져옵니다.
        List<String> relatedUuids = UuidMatching.UuidPut();

        // 가정: relatedUuids에는 연관된 데이터의 JSON 문자열이 포함되어 있습니다.
        for (String uuidJson : relatedUuids) {
            // JSON 문자열을 Map 객체로 변환합니다.
            Map<String, Object> uuidMap = mapper.readValue(uuidJson, Map.class);

            // RSA 메시지를 구성합니다.
            Map<String, Object> evaMessage = new LinkedHashMap<>();

            // uuidMap에서 필요한 데이터를 추출하여 RSA 메시지를 구성합니다.
            // 예를 들어, egoPoseDto의 translation과 orientation을 추출합니다.
            // 추출 로직은 프로젝트의 데이터 구조에 맞게 작성해야 합니다.

            // 공통 필드를 추가합니다.
            evaMessage.put("msgCnt", msgCnt++);
            evaMessage.put("timeStamp", /* 추출된 timestamp 값 */);
            evaMessage.put("typeEvent", 0); // 이벤트 타입
            evaMessage.put("priority", "00");

            // 위치 및 방향 정보를 추가합니다.
            Map<String, Object> position = new LinkedHashMap<>();
            position.put("utcTime", /* 추출된 utcTimeMap 값 */);
            position.put("long", /* 추출된 경도 값 */);
            position.put("lat", /* 추출된 위도 값 */);
            position.put("elevation", /* 추출된 고도 값 */);
            evaMessage.put("position", position);

            // 추가적인 지역 정보를 구성합니다.
            List<Map<String, Object>> regional = new ArrayList<>();
            Map<String, Object> regionalItem = new LinkedHashMap<>();
            regionalItem.put("regionId", 4); // 예시 regionId

            Map<String, Object> regExtValue = new LinkedHashMap<>();
            Map<String, Object> cits = new LinkedHashMap<>();
            cits.put("stopID", /* 추출된 stopID */);
            cits.put("text", /* 추출된 text */);
            regExtValue.put("cits", cits);
            regionalItem.put("regExtValue", regExtValue);
            regional.add(regionalItem);

            evaMessage.put("regional", regional);

            // 최종적인 RSA 메시지를 구성합니다.
            Map<String, Object> rsaMsg = new LinkedHashMap<>();
            rsaMsg.put("rsaMsg", evaMessage);

            // 생성된 RSA 메시지를 JSON 문자열로 변환하여 반환합니다.
            return mapper.writeValueAsString(rsaMsg);
        }

        // 관련 데이터가 없을 경우 null 반환
        return null;
    }
}