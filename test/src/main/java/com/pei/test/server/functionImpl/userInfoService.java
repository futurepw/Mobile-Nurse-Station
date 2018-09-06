package com.pei.test.server.functionImpl;

import com.pei.test.dao.NurseMapper;
import com.pei.test.entity.Nurse;
import com.pei.test.server.entity.settingEntity;
import com.pei.test.server.entity.userInfoEntity;
import com.pei.test.server.function;
import com.pei.test.tool.toJson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userInfoService implements function<userInfoEntity> {
    @Resource
    NurseMapper nurseMapper;

    public userInfoEntity getSetting(String Nid) {
        Nurse nurse = nurseMapper.selectByPrimaryKey(Nid);
        userInfoEntity userInfoEntity = new userInfoEntity();
        userInfoEntity.setBirthday(nurse.getBirthday());
        userInfoEntity.setDepartment(nurse.getDepartmentId());
        userInfoEntity.setEntry_time(nurse.getEntryTime());
        userInfoEntity.setName(nurse.getName());
        userInfoEntity.setSex(nurse.getSex());
        userInfoEntity.setNurse_id(nurse.getNurseId());
        return userInfoEntity;
    }

    @Override
    public String execute(userInfoEntity userInfoEntity) {
        return toJson.toJson(getSetting(userInfoEntity.getNurse_id()));
    }
}
