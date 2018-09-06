package com.pei.test.entity;

import java.util.Date;

public class Infusion {
    private String infusionId;

    private String patientId;

    private Date time;

    private String formula;

    private String remark;

    public String getInfusionId() {
        return infusionId;
    }

    public void setInfusionId(String infusionId) {
        this.infusionId = infusionId == null ? null : infusionId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
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
        this.formula = formula == null ? null : formula.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}