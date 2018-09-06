package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.server.entity.settingEntity;
import com.pei.test.server.functionImpl.settingService;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.resourceToString;
import com.pei.test.tool.toJson;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

@EnableTransactionManagement
@RestController
public class settingController {

    @javax.annotation.Resource
    settingService settingService;
    @RequestMapping("/setting")
    public String setting(String nid) {
        settingEntity settingEntity = new settingEntity();
        settingEntity.setId(nid);
        return settingService.execute(settingEntity);
    }

    @RequestMapping("/settingUserInfo")
    public String settingUserInfo(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./setting/userInfo.html?nid="+nid);
    }

    @RequestMapping("/settingChangePw")
    public String settingChangePw(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./setting/changePw.html?nid="+nid);
    }

    @RequestMapping("/settingManage")
    public String settingManage(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./setting/manage.html?nid="+nid);
    }

    @RequestMapping("/settingAbout")
    public String settingAbout(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./setting/about.html?nid="+nid);
    }

    @RequestMapping("/settingLogout")
    public String settingLogout() {
        return "";
    }

    @RequestMapping("/settingInspect")
    public String settingInspect(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./inspect.html?nid="+nid);
    }

    @RequestMapping("/settingNursing")
    public String settingNursing(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./nursing.html?nid="+nid);
    }

    @RequestMapping("/settingSetting")
    public String settingSetting(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "./setting.html?nid="+nid);
    }

    @RequestMapping("/settingIndex")
    public String settingIndex(String nid) {
        return getJumpPage(nid, "0", "SUCCESS", "../index.html?user="+nid);
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
