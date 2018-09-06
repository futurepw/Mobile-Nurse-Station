package com.pei.test.server;

import com.pei.test.dao.CallsMapper;
import com.pei.test.dao.CareMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface function<T> {
    String execute(T entity);//每一个业务都要有一个execute方法，返回字符串类型 结构为 JSON
}
