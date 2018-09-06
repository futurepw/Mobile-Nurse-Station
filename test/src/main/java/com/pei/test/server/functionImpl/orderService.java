package com.pei.test.server.functionImpl;

import com.pei.test.dao.OrdersMapper;
import com.pei.test.server.entity.orderEntity;
import com.pei.test.server.function;
import com.pei.test.tool.toJson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class orderService implements function<orderEntity> {
    @Resource
    OrdersMapper ordersMapper;
    public List<orderEntity> getAllByPid(String Pid){
        return ordersMapper.selectAllByPid(Pid);
    }
    @Override
    public String execute(orderEntity entity) {
        return toJson.toJson(getAllByPid(entity.getPatient_id()));
    }
}
