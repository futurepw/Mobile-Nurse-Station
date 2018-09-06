package com.pei.test.dao;

import com.pei.test.entity.Ward;
import com.pei.test.entity.WardKey;

public interface WardMapper {
    int deleteByPrimaryKey(WardKey key);

    int insert(Ward record);

    int insertSelective(Ward record);

    Ward selectByPrimaryKey(WardKey key);

    Ward SelectByPid(String pid);

    int updateByPrimaryKeySelective(Ward record);

    int updateByPrimaryKey(Ward record);
}