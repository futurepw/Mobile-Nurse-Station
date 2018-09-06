package com.pei.test.server.functionImpl;

import com.google.gson.Gson;
import com.pei.test.dao.SignsMapper;
import com.pei.test.entity.Signs;
import com.pei.test.server.function;
import com.pei.test.tool.toChartJson;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.swing.*;

@Service
public class signsService implements function<Signs> {
    @Resource
    SignsMapper signsMapper;


    public String execute(String pid) {
        return getSignList(pid);
    }

    @Override
    public String execute(Signs entity) {
        if (entity == null)
            return "400";
        else{
            insert(entity);
            return "200";
        }
    }

    public int insert(Signs entity) {
        int result = signsMapper.insert(entity);
        return result;
    }

    public String getSignList(String pid) {
        signsMapper.selectByPid(pid);
        Gson gson = new Gson();
        gson.toJson(signsMapper.selectByPid(pid));
        return (toChartJson.chartJson(signsMapper.selectByPid(pid)));

    }
}
