package com.pei.test.server.functionImpl;

import com.pei.test.dao.InfusionMapper;
import com.pei.test.entity.Infusion;
import com.pei.test.server.entity.infusionEntity;
import com.pei.test.server.function;
import com.pei.test.tool.toJson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class infusionService implements function<Infusion> {
    @Resource
    InfusionMapper infusionMapper;

    List<infusionEntity> getInfusionByPid(String Pid){
        return infusionMapper.selectAllByPid(Pid);
    }

    @Override
    public String execute(Infusion entity) {
        return toJson.toJson(getInfusionByPid(entity.getPatientId()));
    }
}
