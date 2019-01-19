package org.bhoopendra.react.app;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

public class FlowableClient {
    public static void main(String args[]){
        Flowable.range(1,10).observeOn(Schedulers.computation()).map(v->v*2).blockingSubscribe(System.out::println);
        Flowable.range(1,200).blockingSubscribe();
    }
}
