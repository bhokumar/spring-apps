package org.bhoopendra.rest;

import com.example.RestApplicationTests;
import org.bhoopendra.rest.server.RestServerRule;
import org.bhoopendra.rest.services.ArticleHandlerTests;
import org.education.RestApplication;
import org.junit.ClassRule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ArticleHandlerTests.class,
        RestApplicationTests.class,
})
public class IntegrationTests {
    @ClassRule
    public static final TestRule testRule = new RestServerRule();
}
