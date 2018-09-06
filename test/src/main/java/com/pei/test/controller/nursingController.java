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
public class nursingController {

    @RequestMapping("/nursingIndex")
    public String nursingIndex(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "../index.html?nid="+nid);
    }


    @RequestMapping("/nursingNext")
    public String nursingNext(@RequestBody String params) {
        System.out.println(params + "           ");
        info info= com.pei.test.tool.info.toInfo(params);
        return getJumpPage(info.getNid(), "0", params, "./subNursing.html?nid="+info.getNid()+"&id="+info.getId());
    }

    @RequestMapping("/nursingInspect")
    public String nursingInspect() {
        return getJumpPage("user", "0", "SUCCESS", "./inspect.html");
    }

    @RequestMapping("/nursingNursing")
    public String nursingNursing() {
        return getJumpPage("user", "0", "SUCCESS", "./nursing.html");
    }

    @RequestMapping("/nursingSetting")
    public String nursingSetting() {
        return getJumpPage("user", "0", "SUCCESS", "./setting.html");
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
