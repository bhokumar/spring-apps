package org.bhoopendra.rest.server;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RestServerRule implements TestRule {

    @Override
    public Statement apply(final Statement statement, final Description description) {
        return new RestServerStatement(statement,description);
    }
}
