package org.bhoopendra.react.app;

public class Todo {
    private String task;

    public Todo(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "task='" + task + '\'' +
                '}';
    }
}
