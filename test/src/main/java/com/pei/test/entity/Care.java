package com.pei.test.entity;

import java.util.Date;

public class Care {
    private String careId;

    private String patientId;

    private Date time;

    private String way;

    private String remark;

    public String getCareId() {
        return careId;
    }

    public void setCareId(String careId) {
        this.careId = careId == null ? null : careId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way == null ? null : way.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}