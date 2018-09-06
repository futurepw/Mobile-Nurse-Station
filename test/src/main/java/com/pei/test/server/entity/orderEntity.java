package com.pei.test.server.entity;

import java.util.Date;

public class orderEntity {
    private String order_sn;
    private String order_code;
    private String pack_sn;
    private String patient_id;
    private String name;
    private String ward_no;
    private String bed_no;
    private String frequ_code;
    private String supply_code;
    private String drug_specification;
    private Double dosage;
    private String dosage_unit;
    private Date start_time;
    private Date end_time;

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public String getOrder_code() {
        return order_code;
    }

    public void setOrder_code(String order_code) {
        this.order_code = order_code;
    }

    public String getPack_sn() {
        return pack_sn;
    }

    public void setPack_sn(String pack_sn) {
        this.pack_sn = pack_sn;
    }

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

    public String getFrequ_code() {
        return frequ_code;
    }

    public void setFrequ_code(String frequ_code) {
        this.frequ_code = frequ_code;
    }

    public String getSupply_code() {
        return supply_code;
    }

    public void setSupply_code(String supply_code) {
        this.supply_code = supply_code;
    }

    public String getDrug_specification() {
        return drug_specification;
    }

    public void setDrug_specification(String drug_specification) {
        this.drug_specification = drug_specification;
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosge) {
        this.dosage = dosge;
    }

    public String getDosage_unit() {
        return dosage_unit;
    }

    public void setDosage_unit(String dosage_unit) {
        this.dosage_unit = dosage_unit;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }
}
