package com.chart.wq;

import org.springframework.stereotype.Component;

@Component
public class CsvBusiness extends TestBusiness {

    @Override
    public String getName() {
        return "csv";
    }
}
