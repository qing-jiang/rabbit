package com.adp.str;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Qingjiang Li on 2018/8/4.
 */
public class StringUtil {

    public static final String DATA_FORMAT = "";
    public static final DateTimeFormatter  dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    public static String dateToStr(LocalDateTime date) {
        return date.format(dtf);
    }

    public static LocalDateTime strToDate(String source) {
        return LocalDateTime.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }



}
