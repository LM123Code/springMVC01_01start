package com.springMVC01_01start.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LM_Code
 * @create 2019-04-07-17:52
 */
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if(s == null){
            throw  new RuntimeException("请您传入参数");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        }catch (Exception e){
            throw new RuntimeException("参数错误");
        }
    }
}
