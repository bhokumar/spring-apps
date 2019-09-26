package org.robots.apps.mybatisapp.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumBusinessServiceImplTest {

    @Test
    public void calculateSum() {
        SumBusinessServiceImpl  sumBusinessService = new SumBusinessServiceImpl();
        long actualResult = sumBusinessService.getSum(new int[] {1,2,3});

        long expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }
}
