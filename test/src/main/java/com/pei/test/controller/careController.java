package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.entity.Care;
import com.pei.test.tool.info;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.toJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pei.test.server.functionImpl.careService;
@EnableTransactionManagement
@RestController
public class careController {
    @Autowired
    careService careService;

    @RequestMapping("/care")
    public String care(@RequestBody String parm) {
        Care care = new Care();
        info info= com.pei.test.tool.info.toInfo(parm);
        care.setPatientId(info.getId());
        return toJson.toResponse(info.getNid(),"200","SUCESS",careService.execute(care));
    }

    @RequestMapping("/careBack")
    public String careBack(@RequestBody String parm) {
        info info= com.pei.test.tool.info.toInfo(parm);
        return getJumpPage(info.getNid(), "0", "SUCCESS", "../subNursing.html?nid="+info.getNid()+"&id="+info.getId());
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}

