package orgg.react.app.stock;

public class StockFetecher {
    public static StockInfo fetch(final String company){
        return new StockInfo(company,YahooFinance.getPrice(company));
    }
}
