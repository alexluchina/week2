package com.alex.day17.util;

import java.io.*;

/**
 * Created by mi on 2020/9/25
 */
public class StreamUtil {
    public static void closeAll(Closeable ... closeables){
       try {
           for (Closeable closeable:closeables){
               closeable.close();
           }
       } catch (IOException e) {
           e.printStackTrace();
       }

    }

    public static String readTextFile(InputStream src){
        try {
            InputStreamReader isr = new InputStreamReader(src,"utf-8");
            BufferedReader br = new BufferedReader(isr);
            String textLine = br.readLine();
            closeAll(isr);
            return textLine;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";

    }

    public static String readTextFile(File txtFile) throws FileNotFoundException {
        return readTextFile(new FileInputStream(txtFile));
    }

}
