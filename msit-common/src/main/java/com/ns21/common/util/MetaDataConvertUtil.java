package com.ns21.common.util;

import org.osgeo.proj4j.BasicCoordinateTransform;
import org.osgeo.proj4j.CRSFactory;
import org.osgeo.proj4j.CoordinateReferenceSystem;
import org.osgeo.proj4j.ProjCoordinate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * packageName    : com.ns21.common.util
 * fileName       : MetaDataConvertUtil.java
 * author         : kjg08
 * date           : 2023-11-27
 * description    :지리적 좌표 변환 및 시간 변환을 활용하여 복잡한 데이터 조작 작업
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-27        kjg08           최초 생성
 */
public class MetaDataConvertUtil {

    //timestamp를 시간으로 만들때 에 사용
    public static int[] convertTimestamp(String timestampString) {
        // Unix 타임스탬프를 초 단위로 변환
        long timestampInSeconds = (long) Double.parseDouble(timestampString);

        // LocalDateTime으로 변환
        ZonedDateTime dateTime = Instant.ofEpochSecond(timestampInSeconds).atZone(ZoneId.of("UTC"));

        // 년도 추출
        int startYear = dateTime.getYear();

        // 시작 시간 추출 (예: 시간, 분, 초 형식)
        int startTime = Integer.parseInt(dateTime.format(DateTimeFormatter.ofPattern("HHmmss")));

        return new int[]{startYear, startTime};
    }

    //translation 을 위경고도로 만들때 에 사용
    private static final ConcurrentHashMap<String, long[]> cache = new ConcurrentHashMap<>();
    public static long[] utmToLatLon(double utmX, double utmY, int utmZone, double elevation) {
        String key = utmX + "-" + utmY + "-" + utmZone + "-" + elevation;

        // 캐시에서 결과를 조회합니다.
        return cache.computeIfAbsent(key, k -> {
            CRSFactory crsFactory = new CRSFactory();

            // 좌표계 정의 및 변환 로직
            String utmCrs = "EPSG:326" + utmZone;
            CoordinateReferenceSystem utm = crsFactory.createFromName(utmCrs);
            CoordinateReferenceSystem latLon = crsFactory.createFromName("EPSG:4326");

            BasicCoordinateTransform transform = new BasicCoordinateTransform(utm, latLon);
            ProjCoordinate utmCoord = new ProjCoordinate(utmX, utmY);
            ProjCoordinate latLonCoord = new ProjCoordinate();
            transform.transform(utmCoord, latLonCoord);

            long latitudeInMicroDegrees = (long) (latLonCoord.y * 10_000_000);
            long longitudeInMicroDegrees = (long) (latLonCoord.x * 10_000_000);
            long elevationInMeters = (long) elevation;

            // 새로 계산된 결과를 반환합니다.
            return new long[]{latitudeInMicroDegrees, longitudeInMicroDegrees, elevationInMeters};
        });
    }

    //rotation(ego_pose) 방향으로 변환할때 사용
    public static String quaternionToFormattedString(List<Double> quaternion) {
        double[] euler = quaternionToEuler(quaternion);

        // 라디안을 도로 변환
       // double roll = Math.toDegrees(euler[0]);
       // double pitch = Math.toDegrees(euler[1]);
        double yaw = Math.toDegrees(euler[2]);

        // 범위 조정 및 소수점 이하 반올림
       // roll = (roll + 360) % 360;
       // pitch = (pitch + 360) % 360;
        yaw = (yaw + 360) % 360;

        // 문자열 형식으로 포매팅
        return String.format("%04.0f", yaw);
    }


    private static double[] quaternionToEuler(List<Double> quaternion) {
        double x = quaternion.get(0);
        double y = quaternion.get(1);
        double z = quaternion.get(2);
        double w = quaternion.get(3);

        double t0 = 2.0 * (w * x + y * z);
        double t1 = 1.0 - 2.0 * (x * x + y * y);
        double roll = Math.atan2(t0, t1);

        double t2 = 2.0 * (w * y - z * x);
        t2 = Math.min(t2, 1.0);
        t2 = Math.max(t2, -1.0);
        double pitch = Math.asin(t2);

        double t3 = 2.0 * (w * z + x * y);
        double t4 = 1.0 - 2.0 * (y * y + z * z);
        double yaw = Math.atan2(t3, t4);

        return new double[]{roll, pitch, yaw}; // 반환 값은 라디안 단위의 오일러 각도(roll, pitch, yaw)
    }

    //rotation(seneor.json) 헤딩값으로 변환할때 사용 (ffff)
    public static String quaternionToHeading(List<Double> quaternion) {
        // Assuming quaternion is [w, x, y, z]
        double w = quaternion.get(0);
        double x = quaternion.get(1);
        double y = quaternion.get(2);
        double z = quaternion.get(3);

        // Convert to Euler angles
        double t0 = 2.0 * (w * z + x * y);
        double t1 = 1.0 - 2.0 * (y * y + z * z);
        double yaw = Math.atan2(t0, t1);

        // Convert yaw angle to degrees
        double yawDegrees = Math.toDegrees(yaw);

        // Normalize yaw to 0 - 360 degrees
        if (yawDegrees < 0) yawDegrees += 360.0;

        // Convert to hexadecimal string
        int headingInt = (int) Math.round(yawDegrees);
        return String.format("%04x", headingInt).toUpperCase();
    }

    //ego_pose.json 의 timestamp  을 "utcTime":{
    //      "year":0,
    //      "month":0,
    //      "day":0,
    //      "hour":0,
    //      "minute":0,
    //      "second":0,
    //      "offset":-840
    //    }
    // 형식으로 변경
    public static Map<String, Object> convertTimestampToUtcMap(String timestampString) {
        long seconds = (long) Double.parseDouble(timestampString);
        int nanoSeconds = (int) ((Double.parseDouble(timestampString) - seconds) * 1_000_000_000);
        ZonedDateTime dateTime = Instant.ofEpochSecond(seconds, nanoSeconds).atZone(ZoneOffset.UTC);

        Map<String, Object> utcTime = new LinkedHashMap<>();
        utcTime.put("year", dateTime.getYear());
        utcTime.put("month", dateTime.getMonthValue());
        utcTime.put("day", dateTime.getDayOfMonth());
        utcTime.put("hour", dateTime.getHour());
        utcTime.put("minute", dateTime.getMinute());
        utcTime.put("second", dateTime.getSecond());
        utcTime.put("offset", dateTime.getOffset().getTotalSeconds());

        return utcTime;
    }

    //timestamp 값 분 단위까지만 가져와서 527040의 범위에 맞게 수정. 527040 이 넘어가면 롤오버 됨
    public static int minuteOfTheYear(String timestampString) {
        double timestampDouble = Double.parseDouble(timestampString);
        Instant instant = Instant.ofEpochSecond((long) timestampDouble);
        ZonedDateTime zdt = instant.atZone(ZoneId.of("UTC"));
        int yearStart = zdt.getYear();
        ZonedDateTime startOfYear = ZonedDateTime.of(yearStart, 1, 1, 0, 0, 0, 0, ZoneId.of("UTC"));
        long minutesSinceYearStart = Duration.between(startOfYear, zdt).toMinutes();

        // Ensure it fits within 0 to 527040
        return (int) (minutesSinceYearStart % 527041); // Using 527041 to include 0 in the range
    }

}
