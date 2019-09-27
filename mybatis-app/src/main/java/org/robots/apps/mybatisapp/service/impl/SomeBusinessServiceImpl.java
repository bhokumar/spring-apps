package org.robots.apps.mybatisapp.service.impl;

import org.robots.apps.mybatisapp.service.SomeDataService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SomeBusinessServiceImpl {

    private SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public long getSum(int[] items) {
        return Arrays.stream(items).reduce(0, (a,b)-> a+b);
    }

    public long calculateSumUsingDataService() {
        int[] data = someDataService.retrieveAllData();
        return Arrays.stream(data).reduce(0, (a,b) -> a+b);
    }
}
