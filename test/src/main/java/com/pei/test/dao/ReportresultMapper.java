package com.pei.test.dao;

import com.pei.test.entity.Reportresult;
import com.pei.test.entity.ReportresultKey;
import com.pei.test.server.entity.testResultEntity;

import java.util.List;

public interface ReportresultMapper {
    int deleteByPrimaryKey(ReportresultKey key);

    int insert(Reportresult record);

    int insertSelective(Reportresult record);

    Reportresult selectByPrimaryKey(ReportresultKey key);

    List<testResultEntity> selectAllByPid(String Pid);

    int updateByPrimaryKeySelective(Reportresult record);

    int updateByPrimaryKey(Reportresult record);
}