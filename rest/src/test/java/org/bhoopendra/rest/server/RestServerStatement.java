package org.bhoopendra.rest.server;

import org.education.RestApplication;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RestServerStatement extends Statement {
    private final Statement base;

    public RestServerStatement(final Statement base, final Description description){
        this.base = base;
    }

    public void before(){
        RestApplication.start();
    }

    @Override
    public void evaluate() throws Throwable {
        before();
        base.evaluate();
        after();
    }

    public void after(){
    }
}
