package org.robots.apps.mybatisapp.service;

import org.junit.Test;
import org.robots.apps.mybatisapp.service.impl.SomeBusinessServiceImpl;

import static org.junit.Assert.*;

public class SumBusinessServiceImplTest {

    @Test
    public void calculateSum() {
        SomeBusinessServiceImpl sumBusinessService = new SomeBusinessServiceImpl();
        long actualResult = sumBusinessService.getSum(new int[] {1,2,3});

        long expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_EmptyArray() {
        SomeBusinessServiceImpl sumBusinessService = new SomeBusinessServiceImpl();
        long actualResult = sumBusinessService.getSum(new int[] {1,2,3});

        long expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }
}
