package com.pei.test.dao;

import com.pei.test.entity.Calls;


import java.util.List;

public interface CallsMapper {
    int deleteByPrimaryKey(String callId);

    int insert(Calls record);

    int insertSelective(Calls record);

    Calls selectByPrimaryKey(String callId);

    int updateByPrimaryKeySelective(Calls record);

    int updateByPrimaryKey(Calls record);

    List<Calls> selectAll();
}