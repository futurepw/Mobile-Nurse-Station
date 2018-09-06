package com.pei.test.tool;

import com.google.gson.Gson;

public class info {
    String id;
    String nid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }
    public static info toInfo(String json){
        Gson gson=new Gson();
        return  gson.fromJson(json,info.class);
    }
}
