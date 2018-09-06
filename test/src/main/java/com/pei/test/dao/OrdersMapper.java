package com.pei.test.dao;

import com.pei.test.entity.Orders;
import com.pei.test.server.entity.orderEntity;

import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(String orderSn);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(String orderSn);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<orderEntity> selectAllByPid(String Pid);
}