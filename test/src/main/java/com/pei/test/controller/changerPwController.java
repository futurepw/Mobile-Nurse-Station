package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.server.entity.changePwEntity;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.resourceToString;
import com.pei.test.server.functionImpl.changePwService;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableTransactionManagement
@RestController
public class changerPwController {
    @javax.annotation.Resource
    changePwService changePwService;

    @RequestMapping("/changePw")
    public String changePw(@RequestBody String parema) {
        Gson gson = new Gson();
        changePwEntity changePwEntity = gson.fromJson(parema, changePwEntity.class);
        return changePwService.execute(changePwEntity);
    }

    @RequestMapping("/changePwBack")
    public String changePwBack(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "../setting.html?nid=" + nid);
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
