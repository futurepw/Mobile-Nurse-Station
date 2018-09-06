package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.server.entity.userInfoEntity;
import com.pei.test.server.functionImpl.userInfoService;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.resourceToString;
import com.pei.test.tool.toJson;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableTransactionManagement
@RestController
public class userInfoController {

    @javax.annotation.Resource
    userInfoService userInfoService;


    @RequestMapping("/userInfoBack")
    public String userInfoBack(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "../setting.html?nid="+nid);
    }

    @RequestMapping("/userInfo")
    public String userInfo(String username) {
        userInfoEntity userInfoEntity = new userInfoEntity();
        userInfoEntity.setNurse_id(username);
        return toJson.toResponse(username,"200","SUCCESS",userInfoService.execute(userInfoEntity));
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
