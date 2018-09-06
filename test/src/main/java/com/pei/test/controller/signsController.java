package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.entity.Signs;
import com.pei.test.server.entity.signsEntity;
import com.pei.test.server.functionImpl.signsService;
import com.pei.test.tool.idGenerate;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.resourceToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@EnableTransactionManagement
@RestController
public class signsController {
    @javax.annotation.Resource
    signsService signsService;

    @RequestMapping("/signs")
    public String signs(@RequestBody String parame) {
        Date day=new Date();
        Gson gs = new Gson();
        signsEntity signsEntity = gs.fromJson(parame,signsEntity.class);
        Signs signs = new Signs();
        signs.setPatientId(signsEntity.getPatient_id());
        signs.setSignsNo(idGenerate.generateId("TZ"));
        signs.setTemperature(signsEntity.getTemperature());
        signs.setBreathe(signsEntity.getBreathe());
        signs.setBloodPressureh(signsEntity.getBlood_pressureH());
        signs.setBloodPressurel(signsEntity.getBlood_pressureL());
        signs.setPulse(signsEntity.getPulse());
        signs.setHeight(signsEntity.getHeight());
        signs.setWeight(signsEntity.getWeight());
        signs.setDate(day);
        return signsService.execute(signs);
    }

    @RequestMapping("/signsBack")
    public String signsBack(String nid) {
        return getJumpPage("user", "0", "SUCCESS", "../inspect.html?nid=" + nid);
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
