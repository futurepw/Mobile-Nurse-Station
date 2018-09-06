package com.pei.test.entity;

import java.util.Date;

public class Work {
    private String workId;

    private String patientId;

    private String departmentId;

    private String wardNo;

    private String bedNo;

    private String orderSn;

    private String infusionId;

    private String careId;

    private String checkOrder;

    private String checkInfusion;

    private String checkCare;

    private String checkSigns;

    private Date time;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo == null ? null : wardNo.trim();
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getInfusionId() {
        return infusionId;
    }

    public void setInfusionId(String infusionId) {
        this.infusionId = infusionId == null ? null : infusionId.trim();
    }

    public String getCareId() {
        return careId;
    }

    public void setCareId(String careId) {
        this.careId = careId == null ? null : careId.trim();
    }

    public String getCheckOrder() {
        return checkOrder;
    }

    public void setCheckOrder(String checkOrder) {
        this.checkOrder = checkOrder == null ? null : checkOrder.trim();
    }

    public String getCheckInfusion() {
        return checkInfusion;
    }

    public void setCheckInfusion(String checkInfusion) {
        this.checkInfusion = checkInfusion == null ? null : checkInfusion.trim();
    }

    public String getCheckCare() {
        return checkCare;
    }

    public void setCheckCare(String checkCare) {
        this.checkCare = checkCare == null ? null : checkCare.trim();
    }

    public String getCheckSigns() {
        return checkSigns;
    }

    public void setCheckSigns(String checkSigns) {
        this.checkSigns = checkSigns == null ? null : checkSigns.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}