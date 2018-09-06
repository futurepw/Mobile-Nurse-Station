package com.pei.test.dao;

import com.pei.test.entity.Signs;
import com.pei.test.entity.SignsKey;
import com.pei.test.server.entity.chartEntity;

import java.util.List;

public interface SignsMapper {
    int deleteByPrimaryKey(SignsKey key);

    int insert(Signs record);

    int insertSelective(Signs record);

    Signs selectByPrimaryKey(SignsKey key);

    int updateByPrimaryKeySelective(Signs record);

    int updateByPrimaryKey(Signs record);

    List<chartEntity> selectByPid(String pid);
}