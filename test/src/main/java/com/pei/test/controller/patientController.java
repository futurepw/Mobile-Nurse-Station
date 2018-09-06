package com.pei.test.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.pei.test.entity.Nurse;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.resourceToString;
import com.pei.test.tool.toJson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pei.test.server.functionImpl.patientService;

import javax.servlet.http.HttpServletRequest;

@EnableTransactionManagement
@RestController
public class patientController {
    @Value("classpath:json/vue_data_patient.json")
    private Resource resource;

    @javax.annotation.Resource
    patientService patientService;

    @RequestMapping("/patient")
    public String patient(@RequestParam String nid) {
        Nurse nurse = new Nurse();
        nurse.setNurseId(nid);
        return toJson.toResponse("","200","SUCESS",patientService.execute(nurse));

//        return resourceToString.trans(resource);
    }

    @RequestMapping("/patientBack")
    public String patientBack(@RequestBody String params) {
        System.out.println(params + "           ");
        return getJumpPage("user", "0", params, "./nursing.html");
    }

    @RequestMapping("/patientNext")
    public String patientNext(@RequestBody String params) {
        System.out.println(params + "         ");
        return getJumpPage("user", "0", "SUCCESS", "./inspect/signs.html");
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
