package org.robots.apps.mybatisapp.service;

import org.junit.Test;
import org.robots.apps.mybatisapp.service.impl.SomeBusinessServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SumBusinessServiceImplMockTest {

    @Test
    public void calculateSum_Basic() {
        SomeBusinessServiceImpl sumBusinessService = new SomeBusinessServiceImpl();

        SomeDataService someDataService = mock(SomeDataService.class);
        when(someDataService.retrieveAllData()).thenReturn(new int[] {1,2,3});

        sumBusinessService.setSomeDataService(someDataService);
        long actualResult = sumBusinessService.calculateSumUsingDataService();

        long expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_EmptyArray() {
        SomeBusinessServiceImpl sumBusinessService = new SomeBusinessServiceImpl();

        SomeDataService someDataService = mock(SomeDataService.class);
        when(someDataService.retrieveAllData()).thenReturn(new int[]{});

        sumBusinessService.setSomeDataService(someDataService);
        long actualResult = sumBusinessService.calculateSumUsingDataService();

        long expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_SingleElement() {
        SomeBusinessServiceImpl sumBusinessService = new SomeBusinessServiceImpl();

        SomeDataService someDataService = mock(SomeDataService.class);
        when(someDataService.retrieveAllData()).thenReturn(new int[]{1});

        sumBusinessService.setSomeDataService(someDataService);
        long actualResult = sumBusinessService.calculateSumUsingDataService();

        long expectedResult = 1;

        assertEquals(expectedResult, actualResult);
    }
}
