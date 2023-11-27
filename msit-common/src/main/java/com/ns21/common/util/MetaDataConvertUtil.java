package com.ns21.common.util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * packageName    : com.ns21.common.util
 * fileName       : MetaDataConvertUtil.java
 * author         : kjg08
 * date           : 2023-11-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-27        kjg08           최초 생성
 */
public class MetaDataConvertUtil {

    public static String[] convertTimestamp(String timestampString) {
        // Unix 타임스탬프를 초 단위로 변환
        long timestampInSeconds = (long) Double.parseDouble(timestampString);

        // LocalDateTime으로 변환
        ZonedDateTime dateTime = Instant.ofEpochSecond(timestampInSeconds).atZone(ZoneId.of("UTC"));

        // 년도 추출
        int startYear = dateTime.getYear();

        // 시작 시간 추출 (예: 시간, 분, 초 형식)
        String startTime = dateTime.format(DateTimeFormatter.ofPattern("HHmmss"));

        return new String[] {String.valueOf(startYear), startTime};
    }

}
