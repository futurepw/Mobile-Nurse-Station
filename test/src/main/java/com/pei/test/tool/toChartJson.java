package com.pei.test.tool;

import com.pei.test.server.entity.chartEntity;

import java.text.SimpleDateFormat;
import java.util.List;

public class toChartJson {
    public static String chartJson(List<chartEntity> chartEntities){
        String patient_id=chartEntities.get(0).getPatient_id();
        String name=chartEntities.get(0).getName();
        String ward_no=chartEntities.get(0).getWard_no();
        String bed_no=chartEntities.get(0).getBed_no();
        int length=chartEntities.size();
        String temperature="[";
        String blood_pressureH="[";
        String blood_pressureL="[";
        String pluse="[";
        String date="[";
        SimpleDateFormat time=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        temperature+=chartEntities.get(0).getTemperature();
        blood_pressureH+=chartEntities.get(0).getBlood_pressureH();
        blood_pressureL+=chartEntities.get(0).getBlood_pressureL();
        pluse+=chartEntities.get(0).getPulse();
        date+= "\""+time.format(chartEntities.get(0).getDate())+"\"";
        for(int i=1;i<length;i++){
            temperature+=","+chartEntities.get(i).getTemperature();
            blood_pressureH+=","+chartEntities.get(i).getBlood_pressureH();
            blood_pressureL+=","+chartEntities.get(i).getBlood_pressureL();
            pluse+=","+chartEntities.get(i).getPulse();
            date+=",\""+time.format(chartEntities.get(i).getDate())+"\"";
        }
         temperature+="]";
         blood_pressureH+="]";
         blood_pressureL+="]";
         pluse+="]";
         date+="]";
         String finalStr="\"data\":{\n" +
                 "\"patient_id\":\""+patient_id+"\",\n" +
                 "\"name\":\""+name+"\",\n" +
                 "\"ward_no\":\""+ward_no+"\",\n" +
                 "\"bed_no\":\""+bed_no+"\",\n" +
                 "\"temperature\":"+temperature+",\n" +
                 "\"blood_pressureH\":"+blood_pressureH+",\n" +
                 "\"blood_pressureL\":"+blood_pressureL+",\n"+
                 "\"pulse\":"+pluse+",\n" +
                 "\"date\":"+date+"\n" +
                 "}";
         return finalStr;
    }
}
