package com.pei.test.entity;

public class Ward extends WardKey {
    private String doctorsId;

    private String nurseId;

    private String type;

    private String comment;

    private String lendFlag;

    public String getDoctorsId() {
        return doctorsId;
    }

    public void setDoctorsId(String doctorsId) {
        this.doctorsId = doctorsId == null ? null : doctorsId.trim();
    }

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId == null ? null : nurseId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getLendFlag() {
        return lendFlag;
    }

    public void setLendFlag(String lendFlag) {
        this.lendFlag = lendFlag == null ? null : lendFlag.trim();
    }
}