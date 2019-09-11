package com.chart.wq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TestBusinessHolder {
    @Autowired
    Map<String, TestBusiness> map;

    public Map<String, TestBusiness> get(){
        return map;
    }

}
