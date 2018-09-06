package com.pei.test.dao;

import com.pei.test.entity.Work;
import com.pei.test.tool.check;

public interface WorkMapper {
    int deleteByPrimaryKey(String workId);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(String workId);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);

    int updateCareCheck(check check);

    int updateInfusionCheck(check check);

    int updateOrderCheck(check check);

}