package com.pei.test.server.functionImpl;

import com.pei.test.dao.ReportMapper;
import com.pei.test.server.entity.testEntity;
import com.pei.test.server.function;
import com.pei.test.tool.toJson;
import org.springframework.stereotype.Service;
import com.pei.test.dao.ReportMapper;
import javax.annotation.Resource;
import java.util.List;

@Service
public class testService implements function<testEntity> {

    @Resource
    ReportMapper reportMapper;
    public List<testEntity> getTestByPid(String Pid){
        return reportMapper.selectAllByPid(Pid);
    }

    @Override
    public String execute(testEntity entity) {
        return toJson.toJson(getTestByPid(entity.getPatient_id()));
    }
}
