package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.tool.info;
import com.pei.test.tool.jumpPage;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@EnableTransactionManagement
@RestController
public class subNursingController {
    @RequestMapping("/subNursingBack")
    public String subNursingBack(String nid) {
        return getJumpPage("user", "0", "SUCCESS", "./nursing.html?nid="+nid);
    }

    @RequestMapping("/subNursingOrder")
    public String subNursingOrder(@RequestBody  String parms) {
        info info= com.pei.test.tool.info.toInfo(parms);
        return getJumpPage(info.getNid(), "0", "SUCCESS", "./nursing/order.html?nid="+info.getNid()+"&id="+info.getId());
    }

    @RequestMapping("/subNursingInfusion")
    public String subNursingInfusion(@RequestBody  String parms) {
        info info= com.pei.test.tool.info.toInfo(parms);
        return getJumpPage("user", "0", "SUCCESS", "./nursing/infusion.html?nid="+info.getNid()+"&id="+info.getId());
    }

    @RequestMapping("/subNursingTest")
    public String subNursingTest(@RequestBody  String parms) {
        info info= com.pei.test.tool.info.toInfo(parms);
        return getJumpPage("user", "0", "SUCCESS", "./nursing/test.html?nid="+info.getNid()+"&id="+info.getId());
    }

    @RequestMapping("/subNursingTestResult")
    public String subNursingTestResult(@RequestBody  String parms) {
        info info= com.pei.test.tool.info.toInfo(parms);
        return getJumpPage("user", "0", "SUCCESS", "./nursing/testResult.html?nid="+info.getNid()+"&id="+info.getId());
    }

    @RequestMapping("/subNursingCare")
    public String subNursingCare(@RequestBody  String parms) {
        info info= com.pei.test.tool.info.toInfo(parms);
        return getJumpPage("user", "0", "SUCCESS", "./nursing/care.html?nid="+info.getNid()+"&id="+info.getId());
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
