package com.pei.test.entity;

public class SignsKey {
    private String signsNo;

    private String patientId;

    public String getSignsNo() {
        return signsNo;
    }

    public void setSignsNo(String signsNo) {
        this.signsNo = signsNo == null ? null : signsNo.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }
}