package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.tool.info;
import com.pei.test.tool.jumpPage;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableTransactionManagement
@RestController
public class manageController {

    @RequestMapping("/manageBack")
    public String settingIndex(@RequestBody String params) {
        info info= com.pei.test.tool.info.toInfo(params);
        return getJumpPage(info.getNid(), "0", "SUCCESS", "../setting.html?nid="+info.getNid());
    }

    @RequestMapping("/managePatient")
    public String patientBack(@RequestBody String params) {
        info info= com.pei.test.tool.info.toInfo(params);
        return getJumpPage("user", "0", params, "../chart/chart.html?nid="+info.getNid()+"&id="+info.getId());
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
