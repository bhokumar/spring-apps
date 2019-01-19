package org.bhoopendra.react.app;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

import java.util.Arrays;
import java.util.List;

public class ReactClient2 {
    public static void main(String[] args) {
        Observable<Todo> todoObservable = Observable.create(observableEmitter -> {
            try {
                List<Todo> todos = getTodos();
                for (Todo todo : todos) {
                    observableEmitter.onNext(todo);
                }
                observableEmitter.onComplete();
            } catch (final Exception e) {
                observableEmitter.onError(e);
            }
        });

        todoObservable.subscribe(System.out::println);
    }

    private static List<Todo> getTodos() {
        return Arrays.asList(new Todo("todo1"), new Todo("todo2"));
    }
}
