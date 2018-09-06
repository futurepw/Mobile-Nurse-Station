package com.pei.test.dao;

import com.pei.test.entity.Infusion;
import com.pei.test.server.entity.infusionEntity;

import java.util.List;

public interface InfusionMapper {
    int deleteByPrimaryKey(String infusionId);

    int insert(Infusion record);

    int insertSelective(Infusion record);

    Infusion selectByPrimaryKey(String infusionId);

    int updateByPrimaryKeySelective(Infusion record);

    int updateByPrimaryKey(Infusion record);

    List<infusionEntity> selectAllByPid(String Pid);
}