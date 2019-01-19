package org.bhoopendra.react.app.stock;

public class StockInfo {
    private final String ticker;
    private final int price;

    public StockInfo(String ticker, int price) {
        this.ticker = ticker;
        this.price = price;
    }

    @Override
    public String toString() {
        return "StockInfo{" +
                "ticker='" + ticker + '\'' +
                ", price=" + price +
                '}';
    }
}
