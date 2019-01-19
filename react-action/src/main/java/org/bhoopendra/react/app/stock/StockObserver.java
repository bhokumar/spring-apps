package org.bhoopendra.react.app.stock;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;

import java.util.List;

public class StockObserver {
    public static Observable<StockInfo> getFeed(final List<String> symbols) {
        return Observable.create(subscriber -> processRequest(subscriber, symbols));
    }

    private static void processRequest(ObservableEmitter<? super StockInfo> subscriber, List<String> symbols) {
        System.out.println("Processing....");
        while (true) {
            symbols.stream().map(StockFetcher::fetch).forEach(subscriber::onNext);
        }
    }
}
