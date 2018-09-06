package com.pei.test.server.functionImpl;

import com.pei.test.dao.NurseMapper;
import com.pei.test.entity.Nurse;
import com.pei.test.server.entity.settingEntity;
import com.pei.test.server.function;
import com.pei.test.tool.toJson;
import org.springframework.stereotype.Service;
import com.pei.test.dao.NurseMapper;
import javax.annotation.Resource;

@Service
public class settingService implements function<settingEntity> {
    @Resource
    NurseMapper nurseMapper;

    public settingEntity getSetting(String Nid){
           Nurse nurse = nurseMapper.selectByPrimaryKey(Nid);
           if(nurse!=null){
           settingEntity settingEntity = new settingEntity();
           settingEntity.setId(nurse.getNurseId());
           settingEntity.setName(nurse.getName());
           return settingEntity;}
           else return null;
    }
    @Override
    public String execute(settingEntity entity) {
        return toJson.toJson(getSetting(entity.getId()));
    }
}
