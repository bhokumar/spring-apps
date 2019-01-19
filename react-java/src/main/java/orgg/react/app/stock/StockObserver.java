package orgg.react.app.stock;

import rx.Observable;
import rx.Subscriber;

import java.util.List;

public class StockObserver {

    public static Observable<StockInfo> getFeed(final List<String> companies){
        return Observable.create(new Observable.OnSubscribe<StockInfo>() {
            @Override
            public void call(Subscriber<? super StockInfo> subscriber) {
                processRequest(subscriber,companies);
            }
        });
    }

    private static void processRequest(Subscriber<? super StockInfo> subscriber,List<String> companies){
        while (!subscriber.isUnsubscribed()){
            companies.stream().map(StockFetecher::fetch).forEach(subscriber::onNext);
        }
    }
}
