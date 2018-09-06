package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.server.entity.testResultEntity;
import com.pei.test.tool.info;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.resourceToString;
import com.pei.test.server.functionImpl.testResultService;
import com.pei.test.tool.toJson;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableTransactionManagement
@RestController
public class testResultController {

    @javax.annotation.Resource
    testResultService testResultService;

    @RequestMapping("/testResult")
    public String testResult(@RequestBody String parm) {
        info info= com.pei.test.tool.info.toInfo(parm);
        testResultEntity testResultEntity = new testResultEntity();
        testResultEntity.setPatient_id(info.getId());
        return toJson.toResponse(info.getNid(),"200","SUCCESS",testResultService.execute(testResultEntity));

    }

    @RequestMapping("/testResultBack")
    public String testResultBack(@RequestBody String parm) {
        info info= com.pei.test.tool.info.toInfo(parm);
        return getJumpPage(info.getNid(), "0", "SUCCESS", "../subNursing.html?nid="+info.getNid()+"&id="+info.getId());
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
