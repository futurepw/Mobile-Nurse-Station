package com.pei.test.server.entity;

public class patientEntity {
    private String patient_id;
    private String name;
    private String docter;
    private String ward_no;
    private String bed_no;

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocter() {
        return docter;
    }

    public void setDocter(String docter) {
        this.docter = docter;
    }

    public String getWard_no() {
        return ward_no;
    }

    public void setWard_no(String ward_no) {
        this.ward_no = ward_no;
    }

    public String getBed_no() {
        return bed_no;
    }

    public void setBed_no(String bed_no) {
        this.bed_no = bed_no;
    }
}
