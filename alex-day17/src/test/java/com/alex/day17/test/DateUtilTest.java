package com.alex.day17.test;

import com.alex.day17.util.DateUtil;

import java.util.Date;

/**
 * Created by mi on 2020/9/25
 */
public class DateUtilTest {
    public static void main(String[] args) {
        String sql = "select * from t_order where create_time>='"+ DateUtil.getDateByInitMonth(new Date()) +"' and create_time<='"+DateUtil.getDateByFullMonth(new Date())+"' ";
        System.out.println(sql);
    }
}
