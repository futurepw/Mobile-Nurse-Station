package com.pei.test.tool;

import com.google.gson.Gson;

public class toJson {
    public static <T> String toJson(T entity) {
        Gson gs = new Gson();
        String str = gs.toJson(entity);
        return str;
    }
    public static String  toResponse(String user,String code,String msg,String data){
        String response=new String();
        response="{\n" +
                "\"user\":\""+user+"\",\n"+
                "  \"code\":\""+code+"\",\n" +
                "  \"msg\": \""+msg+"\",\n" +
                "  \"data\":"+data+"" +
                "}";
        return response;
    }
}
