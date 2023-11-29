package com.ns21.common.util;

import org.osgeo.proj4j.BasicCoordinateTransform;
import org.osgeo.proj4j.CRSFactory;
import org.osgeo.proj4j.CoordinateReferenceSystem;
import org.osgeo.proj4j.ProjCoordinate;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
    public static long[] utmToLatLon(double utmX, double utmY, int utmZone, double elevation) {
        CRSFactory crsFactory = new CRSFactory();

        // UTM 좌표계 정의
        String utmCrs = "EPSG:326" + utmZone;  // 북반구의 경우 326, 남반구의 경우 327
        CoordinateReferenceSystem utm = crsFactory.createFromName(utmCrs);

        // 위도/경도 좌표계 정의 (WGS84)
        CoordinateReferenceSystem latLon = crsFactory.createFromName("EPSG:4326");

        // 좌표 변환 객체 생성
        BasicCoordinateTransform transform = new BasicCoordinateTransform(utm, latLon);

        // UTM 좌표 생성
        ProjCoordinate utmCoord = new ProjCoordinate(utmX, utmY);

        // 변환된 위도/경도 좌표
        ProjCoordinate latLonCoord = new ProjCoordinate();
        transform.transform(utmCoord, latLonCoord);

        // 마이크로도 단위로 변환된 위도, 경도 반환
        long latitudeInMicroDegrees = (long) (latLonCoord.y * 10_000_000);
        long longitudeInMicroDegrees = (long) (latLonCoord.x * 10_000_000);
        long elevationInMeters = (long) (elevation * 1);

        // 위도, 경도, 고도 반환
        return new long[]{latitudeInMicroDegrees, longitudeInMicroDegrees, elevationInMeters};
    }

    //rotation(ego_pose) 방향으로 변환할때 사용
    public static String quaternionToFormattedString(List<Double> quaternion) {
        double[] euler = quaternionToEuler(quaternion);

        // 라디안을 도로 변환
        double roll = Math.toDegrees(euler[0]);
        double pitch = Math.toDegrees(euler[1]);
        double yaw = Math.toDegrees(euler[2]);

        // 범위 조정 및 소수점 이하 반올림
        roll = (roll + 360) % 360;
        pitch = (pitch + 360) % 360;
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
        t2 = t2 > 1.0 ? 1.0 : t2;
        t2 = t2 < -1.0 ? -1.0 : t2;
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
}
