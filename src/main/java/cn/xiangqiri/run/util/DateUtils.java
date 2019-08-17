package cn.xiangqiri.run.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
//测试gi拉取
public class DateUtils {
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String TIME_FORMAT = "yyyyMMddHHmmss";

    public static final String DATE_FORMAT_ENGLISH = "MM/dd/yyyy";


    /**
     * 获得当天最小时间
     *
     * @param
     * @return
     */
    public static Date getStartOfDay() {
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }



    /**
     * 获得当天最大时间
     *
     * @param
     * @return
     */
    public static Date getEndOfDay() {
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
        return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }


    /**
     * 获得某天最小时间
     *
     * @param date
     * @return
     */
    public static Date getStartOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获得某天最大时间
     *
     * @param date
     * @return
     */
    public static Date getEndOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
        return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }


    /**
     * 获得某天最小时间
     *
     * @param toDate
     * @return
     */
    public static Date getStartOfDay(String toDate) {
        Date date = stringToDate(toDate);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获得某天最大时间
     *
     * @param toDate
     * @return
     */
    public static Date getEndOfDay(String toDate) {
        Date date = stringToDate(toDate);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
        return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }


    /**
     * 获取当前日期
     *
     * @return
     */
    public static String getCurrentDate() {
        String datestr = null;
        SimpleDateFormat df = new SimpleDateFormat(DateUtils.DATE_PATTERN);
        datestr = df.format(new Date());
        return datestr;
    }

    /**
     * 获取当前日期时间
     *
     * @return
     */
    public static String getCurrentDateTime() {
        String datestr = null;
        SimpleDateFormat df = new SimpleDateFormat(DateUtils.DATE_TIME_PATTERN);
        datestr = df.format(new Date());
        return datestr;
    }

    /**
     * 获取当前日期
     *
     * @return
     */
    public static String getCurrentTime() {
        String datestr = null;
        SimpleDateFormat df = new SimpleDateFormat(DateUtils.DATE_TIME_PATTERN);
        datestr = df.format(new Date());
        return datestr;
    }

    /**
     * 将字符串日期转换为日期格式（yyyy-MM-dd HH:mm:ss）
     *
     * @param datestr
     * @return
     */
    public static Date stringToDateTime(String datestr) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat(DateUtils.DATE_TIME_PATTERN);

        try {
            date = df.parse(datestr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 将字符串日期转换为日期格式（yyyy-MM-dd）
     *
     * @param datestr
     * @return
     */
    public static Date stringToDate(String datestr) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat(DateUtils.DATE_PATTERN);
        try {
            date = df.parse(datestr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    /**
     * 将字符串日期转换为日期格式
     * 自定义格式
     *
     * @param sourceDate
     * @return
     */
    public static Date stringToDate(String sourceDate, String dateFormat) {
        SimpleDateFormat df = new SimpleDateFormat(dateFormat);
        try {
            return df.parse(sourceDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 将日期格式日期转换为字符串格式
     *
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        String datestr = null;
        SimpleDateFormat df = new SimpleDateFormat(DateUtils.DATE_PATTERN);
        datestr = df.format(date);
        return datestr;
    }

    /**
     * 在原有的时间上加一天
     *
     * @param date
     * @return
     */
    public static Date dateAddOneDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, 24);
        date = cal.getTime();
        return date;
    }


    public static String dateChange(String date,String type){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(type);
        Date maxDate = null;
        try {
            maxDate = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dateStr = new SimpleDateFormat("yyyy-MM-dd").format(maxDate);
        return dateStr;
    }
}
