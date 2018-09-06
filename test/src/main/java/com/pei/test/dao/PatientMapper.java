package com.pei.test.dao;

import com.pei.test.entity.Patient;
import com.pei.test.server.entity.patientEntity;

import java.util.List;

public interface PatientMapper {
    int deleteByPrimaryKey(String patientId);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(String patientId);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);

    List<patientEntity> getPatient(String Nid);
}