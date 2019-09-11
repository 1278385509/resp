package com.chart.wq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    private String name;

    @Autowired
    private TestBusinessHolder testBusinessHolder;
    @RequestMapping("/hello")
    public Map<String, TestBusiness> tests(){
        Map<String, TestBusiness> stringTestBusinessMap = testBusinessHolder.get();
        return stringTestBusinessMap;
    }

    @RequestMapping("/yesj")
    public String getNum(){

        return "helloWorld";
    }

    @RequestMapping("/yesj")
    public String tesFile(){

        return "helloWorld";
    }

    @RequestMapping("/hello")
    public Map<String, TestBusiness> hahh(){
        Map<String, TestBusiness> stringTestBusinessMap = testBusinessHolder.get();
        return stringTestBusinessMap;
    }
}
