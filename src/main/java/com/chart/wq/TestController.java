package com.chart.wq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private TestBusinessHolder testBusinessHolder;
    @RequestMapping("/hello")
    public Map<String, TestBusiness> test(){
        Map<String, TestBusiness> stringTestBusinessMap = testBusinessHolder.get();
        return stringTestBusinessMap;
    }
}
