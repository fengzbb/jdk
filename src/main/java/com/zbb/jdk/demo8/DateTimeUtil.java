package com.zbb.jdk.demo8;

import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 * 描述：jdk8 时间使用方法
 *
 * @author: feng
 * @created 2019/6/1
 */
public class DateTimeUtil {


    /**
     * calendar 转化为localdateTIme
     * @param calendar
     * @return
     */
    public static LocalDateTime timeToLocalDateTime(Calendar calendar){
        LocalDateTime localDateTime = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
        return localDateTime;
    }

    public static LocalDateTime timeToLocalDateTime(Timestamp timestamp){
        return timestamp.toLocalDateTime();
    }

    /**
     * localDateTime1 早于 localDateTime2
     * @param localDateTime1
     * @param localDateTime2
     * @return
     */
    public static boolean before(LocalDateTime localDateTime1, LocalDateTime localDateTime2){
        return localDateTime1.isBefore(localDateTime2);
    }

    /**
     * 时间字符串转化为时间
     * @param timeStr
     * @param pattern
     * @return
     */
    public static LocalDateTime strToFormatTime(String timeStr, String pattern){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(timeStr, dateTimeFormatter);
    }

    /**
     * 时间转化特定格式字符串
     * @param localDateTime
     * @param pattern
     * @return
     */
    public static String timeToStr(LocalDateTime localDateTime, String pattern){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return localDateTime.format(dateTimeFormatter);
    }

    /**
     * 修改天数
     * @param localDateTime
     * @param days
     * @return
     */
    public static LocalDateTime addDays(LocalDateTime localDateTime, int days){
        return localDateTime.plus(Long.valueOf(days), ChronoUnit.DAYS);
    }

}
