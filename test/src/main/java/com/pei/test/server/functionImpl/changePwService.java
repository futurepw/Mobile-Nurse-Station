package com.pei.test.server.functionImpl;

import com.pei.test.dao.UserMapper;
import com.pei.test.entity.User;
import com.pei.test.server.entity.changePwEntity;
import com.pei.test.server.function;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class changePwService implements function<changePwEntity> {
    @Resource
    UserMapper userMapper;

    public String changePw(changePwEntity changePwEntity) {
        User user = userMapper.selectByPrimaryKey(changePwEntity.getUsername());
        if (user != null && user.getPassword().equals(changePwEntity.getOldpassword())) {
            user.setPassword(changePwEntity.getNewpassword());
            userMapper.updateByPrimaryKey(user);
            return "200";
        }
        return "400";
    }

    @Override
    public String execute(changePwEntity changePwEntity) {
        return changePw(changePwEntity);
    }
}
