package com.pei.test.entity;

import java.util.Date;

public class Orders {
    private String orderSn;

    private String wardNo;

    private String patientId;

    private String departmentId;

    private String bedNo;

    private String orderCode;

    private String packSn;

    private String frequCode;

    private String supplyCode;

    private String drugSpecification;

    private Double dosage;

    private String dosageUnit;

    private Integer persistDays;

    private Date startTime;

    private Date endTime;

    private String startDoctorId;

    private String endDoctorId;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo == null ? null : wardNo.trim();
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

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getPackSn() {
        return packSn;
    }

    public void setPackSn(String packSn) {
        this.packSn = packSn == null ? null : packSn.trim();
    }

    public String getFrequCode() {
        return frequCode;
    }

    public void setFrequCode(String frequCode) {
        this.frequCode = frequCode == null ? null : frequCode.trim();
    }

    public String getSupplyCode() {
        return supplyCode;
    }

    public void setSupplyCode(String supplyCode) {
        this.supplyCode = supplyCode == null ? null : supplyCode.trim();
    }

    public String getDrugSpecification() {
        return drugSpecification;
    }

    public void setDrugSpecification(String drugSpecification) {
        this.drugSpecification = drugSpecification == null ? null : drugSpecification.trim();
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }

    public String getDosageUnit() {
        return dosageUnit;
    }

    public void setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit == null ? null : dosageUnit.trim();
    }

    public Integer getPersistDays() {
        return persistDays;
    }

    public void setPersistDays(Integer persistDays) {
        this.persistDays = persistDays;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStartDoctorId() {
        return startDoctorId;
    }

    public void setStartDoctorId(String startDoctorId) {
        this.startDoctorId = startDoctorId == null ? null : startDoctorId.trim();
    }

    public String getEndDoctorId() {
        return endDoctorId;
    }

    public void setEndDoctorId(String endDoctorId) {
        this.endDoctorId = endDoctorId == null ? null : endDoctorId.trim();
    }
}