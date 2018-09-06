package com.pei.test.dao;

import com.pei.test.entity.Report;
import com.pei.test.entity.ReportKey;
import com.pei.test.server.entity.testEntity;

import java.util.List;

public interface ReportMapper {
    int deleteByPrimaryKey(ReportKey key);

    int insert(Report record);

    int insertSelective(Report record);

    Report selectByPrimaryKey(ReportKey key);

    List<testEntity> selectAllByPid(String Pid);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}