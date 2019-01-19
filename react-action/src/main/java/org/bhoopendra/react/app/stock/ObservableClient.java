package org.bhoopendra.react.app.stock;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class ObservableClient {
    public static void main(String[] args) {
        List<String> symbols = Arrays.asList("GOOGLE","APPLE","MICROSOFT","INTEL");
        Observable<StockInfo> feed = StockObserver.getFeed(symbols);
        System.out.println("Got observable!");
        feed.subscribe(System.out::println);
    }
}
