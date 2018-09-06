package com.pei.test.dao;

import com.pei.test.entity.Care;
import com.pei.test.server.entity.careEntity;

import java.util.List;

public interface CareMapper {
    int deleteByPrimaryKey(String careId);

    int insert(Care record);

    int insertSelective(Care record);

    Care selectByPrimaryKey(String careId);

    int updateByPrimaryKeySelective(Care record);

    int updateByPrimaryKey(Care record);

    List<careEntity> selectAllByPid(String Pid);
}