package orgg.react.app.stock;

import java.util.HashMap;
import java.util.Map;

public class YahooFinance {
    private static Map<String, Integer> stockPrices = new HashMap<String, Integer>();

    static {
        stockPrices.put("GOOGLE",123);
        stockPrices.put("APPLE",98);
        stockPrices.put("MICROSOFT",578);
        stockPrices.put("INTEL",998);
    }

    public static int getPrice(final String company){
        /*if (Math.random()>.7)
            throw new RuntimeException("oops error occurred");*/
        return stockPrices.get(company);
    }
}
