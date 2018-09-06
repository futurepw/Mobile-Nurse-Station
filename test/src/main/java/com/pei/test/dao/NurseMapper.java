package com.pei.test.dao;

import com.pei.test.entity.Nurse;

public interface NurseMapper {
    int deleteByPrimaryKey(String nurseId);

    int insert(Nurse record);

    int insertSelective(Nurse record);

    Nurse selectByPrimaryKey(String nurseId);

    int updateByPrimaryKeySelective(Nurse record);

    int updateByPrimaryKey(Nurse record);
}