package com.pei.test.server.entity;

public class signsEntity {
    private String patient_id;
    private double temperature;
    private double breathe;
    private double blood_pressureH;
    private double blood_pressureL;
    private int pulse;
    private double height;
    private double weight;

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBreathe() {
        return breathe;
    }

    public void setBreathe(double breathe) {
        this.breathe = breathe;
    }

    public double getBlood_pressureH() {
        return blood_pressureH;
    }

    public void setBlood_pressureH(double blood_pressureH) {
        this.blood_pressureH = blood_pressureH;
    }

    public double getBlood_pressureL() {
        return blood_pressureL;
    }

    public void setBlood_pressureL(double blood_pressureL) {
        this.blood_pressureL = blood_pressureL;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
