package orgg.react.app.stock;

import rx.Observable;
import rx.Subscriber;

import java.util.Arrays;
import java.util.List;

public class StockObserverClient {

	public static void main(String[] args) {
		List<String> companies = Arrays.asList("GOOGLE","APPLE","INTEL","MICROSOFT");
		Observable<StockInfo> feed = StockObserver.getFeed(companies);
		feed.subscribe(new Subscriber<StockInfo>() {
			@Override
			public void onCompleted() {

			}

			@Override
			public void onError(Throwable throwable) {
				System.out.println(throwable);
			}

			@Override
			public void onNext(StockInfo stockInfo) {
				if (stockInfo.getCompanyName().equals("GOOGLE") && stockInfo.getSharePrice()>1077){
					System.out.println("Thanks Got it. No more trading");
					unsubscribe();
				}
				System.out.println(stockInfo);
			}
		});
	}

}
