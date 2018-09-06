package com.pei.test.entity;

import java.util.Date;

public class Signs extends SignsKey {
    private Double temperature;

    private Double breathe;

    private Double bloodPressurel;

    private Double bloodPressureh;

    private Date date;

    private Integer pulse;

    private Double height;

    private Double weight;

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getBreathe() {
        return breathe;
    }

    public void setBreathe(Double breathe) {
        this.breathe = breathe;
    }

    public Double getBloodPressurel() {
        return bloodPressurel;
    }

    public void setBloodPressurel(Double bloodPressurel) {
        this.bloodPressurel = bloodPressurel;
    }

    public Double getBloodPressureh() {
        return bloodPressureh;
    }

    public void setBloodPressureh(Double bloodPressureh) {
        this.bloodPressureh = bloodPressureh;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}