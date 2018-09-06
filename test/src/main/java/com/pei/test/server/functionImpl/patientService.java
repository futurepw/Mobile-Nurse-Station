package com.pei.test.server.functionImpl;

import com.google.gson.Gson;
import com.pei.test.dao.PatientMapper;
import com.pei.test.entity.Nurse;
import com.pei.test.server.entity.patientEntity;
import com.pei.test.server.function;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class patientService implements function<Nurse> {

    @Resource
    PatientMapper patientMapper;

    List<patientEntity> getPatient(String Nid){
       return patientMapper.getPatient(Nid);
    }

    @Override
    public String execute(Nurse entity) {
        Gson gs = new Gson();
        return gs.toJson(getPatient(entity.getNurseId()));
    }
}
