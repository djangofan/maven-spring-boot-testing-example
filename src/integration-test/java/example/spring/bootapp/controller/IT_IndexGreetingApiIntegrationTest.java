package example.spring.bootapp.controller;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.specification.RequestSpecification;
import example.spring.bootapp.IntegrationTestBase;
import org.junit.Assert;
import org.junit.Test;
import static com.jayway.restassured.RestAssured.given;

public class IT_IndexGreetingApiIntegrationTest extends IntegrationTestBase
{
    @Test
    public void integrationTestIndexGreeting()
    {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setContentType("application/json; charset=UTF-8");
        RequestSpecification requestSpec = builder.build();

        String greetingMessage = given(requestSpec)
                .when().get("http://" + hostName + ":" + tomcatPort + "/" + contextName + "/index")
                .then().statusCode(200)
                .extract().path("greeting");

        Assert.assertEquals(greetingMessage, "Index Greeting");
    }
}
