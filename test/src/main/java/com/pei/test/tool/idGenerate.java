package com.pei.test.tool;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class idGenerate {

    public static String generateId(String start) {//start为开始字符 如 体征TZ 护理HL 检查JC  输液SY 医嘱YZ
        String randomCode = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String end = "";
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        int max = randomCode.length();
        int min = 0;
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int s = random.nextInt(max) % (max - min + 1) + min;
            end += randomCode.charAt(s);
        }
        return start + df.format(day).toString() + end;
    }
}
