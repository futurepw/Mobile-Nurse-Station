package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.resourceToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableTransactionManagement
@RestController
public class feedbackController {
    @Value("classpath:json/vue_data_feedback.json")
    private Resource resource;

    @RequestMapping("/feedback")
    public String feedback() {
        return resourceToString.trans(resource);
    }

    @RequestMapping("/feedbackBack")
    public String feedbackBack(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./about.html?nid="+nid);
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
