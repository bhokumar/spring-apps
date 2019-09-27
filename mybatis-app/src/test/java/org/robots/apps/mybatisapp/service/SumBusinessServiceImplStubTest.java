package org.robots.apps.mybatisapp.service;

import org.junit.Test;
import org.robots.apps.mybatisapp.service.impl.SomeBusinessServiceImpl;

import static org.junit.Assert.assertEquals;

public class SumBusinessServiceImplStubTest {

    @Test
    public void calculateSum_Basic() {
        SomeBusinessServiceImpl sumBusinessService = new SomeBusinessServiceImpl();
        sumBusinessService.setSomeDataService(new SomeDataService() {
            @Override
            public int[] retrieveAllData() {
                return new int[] {1,2,3};
            }
        });
        long actualResult = sumBusinessService.calculateSumUsingDataService();

        long expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_EmptyArray() {
        SomeBusinessServiceImpl sumBusinessService = new SomeBusinessServiceImpl();
        sumBusinessService.setSomeDataService(new SomeDataService() {
            @Override
            public int[] retrieveAllData() {
                return new int[] {};
            }
        });
        long actualResult = sumBusinessService.calculateSumUsingDataService();

        long expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_SingleElement() {
        SomeBusinessServiceImpl sumBusinessService = new SomeBusinessServiceImpl();
        sumBusinessService.setSomeDataService(new SomeDataService() {
            @Override
            public int[] retrieveAllData() {
                return new int[] {1};
            }
        });
        long actualResult = sumBusinessService.calculateSumUsingDataService();

        long expectedResult = 1;

        assertEquals(expectedResult, actualResult);
    }
}
