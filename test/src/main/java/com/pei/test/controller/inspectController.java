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
public class inspectController {

    @RequestMapping("/inspectIndex")
    public String inspectIndex(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "../index.html?user="+nid);
    }

    @RequestMapping("/inspectInspect")
    public String inspectInspect(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./inspect.html?nid="+nid);
    }

    @RequestMapping("/inspectNursing")
    public String inspectNursing(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./nursing.html?nid="+nid);
    }

    @RequestMapping("/inspectSetting")
    public String inspectSetting(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./setting.html?nid="+nid);
    }

    @RequestMapping("/inspectPatient")
    public String inspectPatient(@RequestBody String params) {
        System.out.println(params + "           ");
        info info= com.pei.test.tool.info.toInfo(params);
        return getJumpPage(info.getNid(), "0", params, "./inspect/signs.html?nid="+info.getNid()+"&id="+info.getId());
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
