package com.alex.day17.util;

import java.util.Date;

/**
 * Created by mi on 2020/9/25
 */
public class DateUtil {
    public static Date getDateByInitMonth(Date src){
        return cn.hutool.core.date.DateUtil.beginOfMonth(src);
    }
    public static Date getDateByFullMonth(Date src){
        return cn.hutool.core.date.DateUtil.endOfMonth(src);
    }
}
