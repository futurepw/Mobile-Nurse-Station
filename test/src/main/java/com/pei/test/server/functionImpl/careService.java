package com.pei.test.server.functionImpl;

import com.pei.test.dao.CareMapper;
import com.pei.test.entity.Care;
import com.pei.test.server.entity.careEntity;
import com.pei.test.server.function;
import com.pei.test.tool.toJson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class careService implements function<Care> {
    @Resource
    CareMapper careMapper;

    List<careEntity> getCareByPid(String Pid) {
        return careMapper.selectAllByPid(Pid);
    }

    @Override
    public String execute(Care entity) {
        return toJson.toJson(getCareByPid(entity.getPatientId()));
    }
}
