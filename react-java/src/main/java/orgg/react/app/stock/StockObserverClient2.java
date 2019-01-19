package orgg.react.app.stock;

import rx.Observable;

import java.util.Arrays;
import java.util.List;

public class StockObserverClient2 {
    public static void main(String[] args){
        List<String> symbols = Arrays.asList("GOOGLE","APPLE","MICROSOFT","INTEL");
        Observable<StockInfo> feed = StockObserver.getFeed(symbols);
        System.out.println("Got Observable!");
        feed.takeWhile(stockInfo -> stockInfo.getSharePrice()>98)
                .subscribe(System.out::println,StockObserverClient2::handleError,()->System.out.println("DONE"));
    }

    public static void handleError(final Throwable throwable){
        System.out.println(throwable);
    }
}
