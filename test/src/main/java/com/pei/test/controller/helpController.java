package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.tool.jumpPage;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableTransactionManagement
@RestController
public class helpController {

    @RequestMapping("/helpBack")
    public String helpBack(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./about.html?nid="+nid);
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
