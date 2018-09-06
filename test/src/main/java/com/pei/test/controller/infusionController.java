package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.entity.Infusion;
import com.pei.test.tool.info;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.toJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pei.test.server.functionImpl.infusionService;

@EnableTransactionManagement
@RestController
public class infusionController {

    @Autowired
    infusionService infusionservice;
    @RequestMapping("/infusion")
    public String infusion(@RequestBody String parm) {
        Infusion infusion = new Infusion();
        info info= com.pei.test.tool.info.toInfo(parm);
        infusion.setPatientId(info.getId());
        return toJson.toResponse(info.getNid(),"200","SUCESS",infusionservice.execute(infusion));
    }

    @RequestMapping("/infusionBack")
    public String infusionBack(@RequestBody String parm) {
        info info= com.pei.test.tool.info.toInfo(parm);
        return getJumpPage("user", "0", "SUCCESS", "../subNursing.html?nid="+info.getNid()+"&id="+info.getId());
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
