package org.bhoopendra.react.app.stock;

import java.util.HashMap;
import java.util.Map;

public class YahooFinance {
    private static Map<String,Integer> stockPrices = new HashMap<>();
    static {
        stockPrices.put("GOOGLE",100);
        stockPrices.put("APPLE",450);
        stockPrices.put("MICROSOFT",123);
        stockPrices.put("INTEL",568);
    }
    public static int getPrice(final String symbol){
        return stockPrices.get(symbol);
    }
}
