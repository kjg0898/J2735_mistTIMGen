package com.ns21.common.util;


import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 * packageName    : com.ns21.common.util
 * fileName       : DateUtil.java
 * author         : kimhansol
 * date           : 2023-08-22
 * description    : date 변환 utils
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-22        kimhansol       최초 생성
 */
public class DateUtil {

    /**
    * methodName : minuteOfTheYear
    * author : kimhansol
    * description : j2735 timestamp 계산용 method
    * @params : void
    * @return : int
    **/
    public static int minuteOfTheYear() {
        Instant now = Instant.now();
        ZoneId zoneId = ZoneId.systemDefault(); //Asia/Seoul
        ZonedDateTime zdt = now.atZone(zoneId);
        ZonedDateTime start = ZonedDateTime.of(zdt.getYear(), 1,1,0,0,0,0,zoneId);
        return (int) ChronoUnit.MINUTES.between(start, zdt);
    }

    public static int getYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public static int getMonth() {
        return Calendar.getInstance().get(Calendar.MONTH) +1;
    }

    public static int getDay() {
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }
}
