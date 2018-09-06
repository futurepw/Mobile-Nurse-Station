package com.pei.test.controller;

import com.google.gson.Gson;
import com.pei.test.server.entity.orderEntity;
import com.pei.test.tool.info;
import com.pei.test.tool.jumpPage;
import com.pei.test.tool.resourceToString;
import com.pei.test.server.functionImpl.orderService;
import com.pei.test.tool.toJson;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableTransactionManagement
@RestController
public class orderController {

    @javax.annotation.Resource
    orderService orderService;

    @RequestMapping("/order")
    public String order(@RequestBody String parm) {
        orderEntity orderEntity = new orderEntity();
        info info= com.pei.test.tool.info.toInfo(parm);
        orderEntity.setPatient_id(info.getId());
//        System.out.println(orderService.execute(orderEntity));
        return toJson.toResponse(info.getNid(),"200","SUCESS",orderService.execute(orderEntity));

    }

    @RequestMapping("/orderBack")
    public String orderBack(@RequestBody String parm) {
        info info= com.pei.test.tool.info.toInfo(parm);
        return getJumpPage(info.getNid(), "0", "SUCCESS", "../subNursing.html?nid="+info.getNid()+"&id="+info.getId());
    }

    private String getJumpPage(String user, String code, String msg, String url) {
        jumpPage page = new jumpPage(user, code, msg, url);
        Gson gs = new Gson();
        return gs.toJson(page);
    }
}
