package com.pei.test.tool;


import org.springframework.core.io.Resource;
import java.io.*;

public class resourceToString {
    public static String trans(Resource areaRes){
        File file = null;
        BufferedReader br = null;
        try {
            file = areaRes.getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (file == null)
            return "";
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuffer buffer = new StringBuffer();
        String line = " ";
        try {
            while ((line = br.readLine()) != null){
                buffer.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
