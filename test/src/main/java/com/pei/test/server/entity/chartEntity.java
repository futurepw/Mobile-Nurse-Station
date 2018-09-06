package com.pei.test.server.entity;

import java.util.Date;

public class chartEntity {
    private String name;
    private String ward_no;
    private String patient_id;
    private String bed_no;
    private double temperature;
    private Double breathe;
    private Double blood_pressureH;
    private Double blood_pressureL;
    private int pulse;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWard_no() {
        return ward_no;
    }

    public void setWard_no(String ward_no) {
        this.ward_no = ward_no;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getBed_no() {
        return bed_no;
    }

    public void setBed_no(String bed_no) {
        this.bed_no = bed_no;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Double getBreathe() {
        return breathe;
    }

    public void setBreathe(Double breathe) {
        this.breathe = breathe;
    }

    public Double getBlood_pressureH() {
        return blood_pressureH;
    }

    public void setBlood_pressureH(Double blood_pressureH) {
        this.blood_pressureH = blood_pressureH;
    }

    public Double getBlood_pressureL() {
        return blood_pressureL;
    }

    public void setBlood_pressureL(Double blood_pressureL) {
        this.blood_pressureL = blood_pressureL;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pluse) {
        this.pulse = pluse;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
