package org.robots.apps.mybatisapp.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SumBusinessServiceImpl {
    public long getSum(int[] items) {
        return Arrays.stream(items).reduce(0, (a,b)-> a+b);
    }
}
