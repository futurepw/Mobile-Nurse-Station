package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.entity.User;
import com.pei.test.tool.jumpPage;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;

@EnableTransactionManagement
@RestController
public class indexController {

    @RequestMapping("/index")
    public String aboutBack(String user) {
        return getJumpPage(user, "0", "SUCCESS", "../setting.html?nid="+user);
    }

    @RequestMapping("/indexInspect")
    public String indexInspect(String user) {
        return getJumpPage(user, "0", "SUCCESS", "./templates/inspect.html?nid="+user);
    }

    @RequestMapping("/indexNursing")
    public String indexNursing(String user) {
        return getJumpPage(user, "0", "SUCCESS", "./templates/nursing.html?nid="+user);
    }

    @RequestMapping("/indexSetting")
    public String indexSetting(String user) {
        return getJumpPage(user, "0", "SUCCESS", "./templates/setting.html?nid="+user);
    }


    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
