package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.server.entity.loginEntity;
import com.pei.test.server.functionImpl.loginService;
import com.pei.test.tool.resourceToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@EnableTransactionManagement
@RestController
public class loginController {

    @javax.annotation.Resource
    loginService loginService;
    @ResponseBody
    @RequestMapping("/login")

    public String login(@RequestBody String parm) {
        Gson gson=new Gson();
        loginEntity loginEntity=gson.fromJson(parm, com.pei.test.server.entity.loginEntity.class);
        return loginService.login(loginEntity);
    }

}
