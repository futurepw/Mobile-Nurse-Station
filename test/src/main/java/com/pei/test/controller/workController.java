package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.server.entity.settingEntity;
import com.pei.test.tool.check;
import com.pei.test.tool.toJson;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pei.test.dao.WorkMapper;

import javax.annotation.Resource;

@EnableTransactionManagement
@RestController
public class workController {

    @Resource
    WorkMapper workMapper;

    @RequestMapping("/workCareCheck")
    public String workCareCheck(@RequestBody String parame) {
        Gson gson = new Gson();
        check check = gson.fromJson(parame, check.class);
        if (check == null)
            return "400";
        workMapper.updateCareCheck(check);
        return "200";
    }

    @RequestMapping("/workInfusionCheck")
    public String workInfusionCheck(@RequestBody String parame) {
        Gson gson = new Gson();
        check check = gson.fromJson(parame, check.class);
        if (check == null)
            return "400";
        workMapper.updateInfusionCheck(check);
        return "200";
    }

    @RequestMapping("/workOrderCheck")
    public String workOrderCheck(@RequestBody String parame) {
        Gson gson = new Gson();
        check check = gson.fromJson(parame, check.class);
        if (check == null)
            return "400";
        workMapper.updateOrderCheck(check);
        return "200";
    }

}
