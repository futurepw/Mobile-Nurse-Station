package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.entity.Signs;
import com.pei.test.server.functionImpl.signsService;
import com.pei.test.tool.info;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.resourceToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableTransactionManagement
@RestController
public class chartController {

    @javax.annotation.Resource
    signsService signsService;

    @RequestMapping("/chart")
    public String chart(String id) {
        return "{" + signsService.execute(id) + "}";
    }

    @RequestMapping("/chartBack")
    public String signsBack(@RequestBody String parm) {
        info info = com.pei.test.tool.info.toInfo(parm);
        return getJumpPage(info.getNid(), "0", "SUCCESS", "../setting/manage.html?nid=" + info.getNid());
    }


    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
