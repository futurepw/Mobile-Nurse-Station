package com.pei.test.server.functionImpl;

import com.pei.test.dao.ReportresultMapper;
import com.pei.test.server.entity.testResultEntity;
import com.pei.test.server.function;
import com.pei.test.tool.toJson;
import org.springframework.stereotype.Service;
import com.pei.test.dao.ReportresultMapper;
import javax.annotation.Resource;
import java.util.List;

@Service
public class testResultService implements function<testResultEntity> {

    @Resource
    ReportresultMapper reportresultMapper;

    public List<testResultEntity> getAllByPid(String Pid){
        return reportresultMapper.selectAllByPid(Pid);
    }

    @Override
    public String execute(testResultEntity entity) {
        return toJson.toJson(getAllByPid(entity.getPatient_id()));
    }
}
