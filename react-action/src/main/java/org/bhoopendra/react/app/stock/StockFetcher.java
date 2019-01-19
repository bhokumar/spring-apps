package org.bhoopendra.react.app.stock;

public class StockFetcher {
    public static StockInfo fetch(String symbol){
        return new StockInfo(symbol,YahooFinance.getPrice(symbol));
    }
}
