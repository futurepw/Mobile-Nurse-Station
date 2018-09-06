package com.pei.test.tool;

public class jumpPage {
    private String user;
    private String code;
    private String msg;
    private String url;

    public jumpPage() {
    }

    public jumpPage(String code, String msg, String url) {
        this.code = code;
        this.msg = msg;
        this.url = url;
    }

    public jumpPage(String user, String code, String msg, String url) {
        this.user = user;
        this.code = code;
        this.msg = msg;
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
