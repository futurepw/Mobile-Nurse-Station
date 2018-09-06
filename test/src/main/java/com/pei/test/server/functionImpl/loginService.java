package com.pei.test.server.functionImpl;

import com.pei.test.dao.UserMapper;
import com.pei.test.entity.User;
import com.pei.test.server.entity.loginEntity;
import com.pei.test.server.function;
import com.pei.test.tool.toJson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class loginService implements function<loginEntity> {
    @Resource
    UserMapper userMapper;
    public String login(loginEntity loginEntity){
        User user = userMapper.selectByPrimaryKey(loginEntity.getUsername());
        if (user!=null&&user.getPassword().equals(loginEntity.getPassword())){
            return toJson.toResponse(user.getUsername(),"200"," "," \" \"");
        }
        else
            return toJson.toResponse("","400"," "," \" \"");
    }
    @Override
    public String execute(loginEntity entity) {
        return login(entity);
    }
}
