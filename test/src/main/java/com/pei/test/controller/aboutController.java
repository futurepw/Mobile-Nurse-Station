package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.tool.jumpPage;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableTransactionManagement
@RestController
public class aboutController {
    @RequestMapping("/aboutBack")
    public String aboutBack(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "../setting.html?nid="+nid);
    }

    @RequestMapping("/aboutHelp")
    public String aboutHelp(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./help.html?nid="+nid);
    }

    @RequestMapping("/aboutFeedback")
    public String aboutFeedback(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./feedback.html?nid="+nid);
    }

    @RequestMapping("/aboutExplain")
    public String aboutExplain(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./explain.html?nid="+nid);
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
