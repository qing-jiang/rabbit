package com.adp.test;

import com.adp.str.StringUtil;

import java.time.LocalDateTime;

/**
 * Created by Qingjiang Li on 2018/8/4.
 */
public class TestStringUtil {

    public static void main(String[] args) {
        String str = "1991-12-23 12:12:12";
        LocalDateTime ldt = StringUtil.strToDate(str);

        System.out.println(ldt);

        LocalDateTime ldt2 = LocalDateTime.now();
        String str2 = StringUtil.dateToStr(ldt2);
        System.out.println(str2);
    }

}
