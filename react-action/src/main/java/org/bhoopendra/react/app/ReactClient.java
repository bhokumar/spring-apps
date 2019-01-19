package org.bhoopendra.react.app;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class ReactClient {
    public static void main(String[] args) {
        Observable<Long> observable = Observable.interval(1, TimeUnit.MICROSECONDS);
        observable.subscribe(System.out::println);
    }
}
