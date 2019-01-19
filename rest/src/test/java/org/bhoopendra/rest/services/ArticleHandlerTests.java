package org.bhoopendra.rest.services;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.education.school.beans.Article;
import org.education.school.utils.AppConstants;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class ArticleHandlerTests {
    private static RequestSpecification requestSpecification;

    @BeforeClass
    public static void setUp(){
        final RequestSpecBuilder requestSpecBuilder =new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("http://localhost");
        requestSpecBuilder.setPort(AppConstants.PORT.getValue());
        requestSpecBuilder.setBasePath("/article");
        requestSpecBuilder.addHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
        requestSpecBuilder.addHeader(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON);
        requestSpecBuilder.setContentType("application/json; charset=UTF-8");
        requestSpecification = requestSpecBuilder.build();
        RestAssured.useRelaxedHTTPSValidation();
    }

    @Test
    public void getArticles(){
        RestAssured.given().spec(requestSpecification).when().get().prettyPrint();
        RestAssured.given().spec(requestSpecification).when().get().then().statusCode(Response.Status.OK.getStatusCode());
        //System.out.println(article);
    }

}
