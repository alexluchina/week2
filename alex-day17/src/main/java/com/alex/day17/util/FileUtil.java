package com.alex.day17.util;

/**
 * Created by mi on 2020/9/25
 */
public class FileUtil {
    public static String getExtendName(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }
}
