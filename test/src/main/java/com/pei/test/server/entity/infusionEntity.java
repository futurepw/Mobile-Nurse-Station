package com.pei.test.server.entity;

import java.util.Date;

public class infusionEntity {
    private String infusion_id;
    private String patient_id;
    private String name;
    private String ward_no;
    private String bed_no;
    private Date time;
    private String formula;
    private String remark;

    public String getInfusion_id() {
        return infusion_id;
    }

    public void setInfusion_id(String infusion_id) {
        this.infusion_id = infusion_id;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
