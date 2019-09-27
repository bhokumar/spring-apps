package org.robots.apps.mybatisapp.service;

import org.junit.Test;
import org.robots.apps.mybatisapp.service.impl.SumBusinessServiceImpl;

import static org.junit.Assert.*;

public class SumBusinessServiceImplTest {

    private DataService dataService;

    @Test
    public void calculateSum() {
        SumBusinessServiceImpl sumBusinessService = new SumBusinessServiceImpl();
        long actualResult = sumBusinessService.getSum(new int[] {1,2,3});

        long expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_EmptyArray() {
        SumBusinessServiceImpl  sumBusinessService = new SumBusinessServiceImpl();
        long actualResult = sumBusinessService.getSum(new int[] {1,2,3});

        long expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }
}
