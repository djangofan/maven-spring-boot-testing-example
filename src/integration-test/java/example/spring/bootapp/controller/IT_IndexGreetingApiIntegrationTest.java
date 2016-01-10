package example.spring.bootapp.controller;

import com.jayway.restassured.response.Header;
import example.spring.bootapp.IntegrationTestBase;
import org.junit.Assert;
import org.junit.Test;
import static com.jayway.restassured.RestAssured.with;

public class IT_IndexGreetingApiIntegrationTest extends IntegrationTestBase
{
    @Test
    public void integrationTestIndexGreeting()
    {
        testUrl = getURLFromString("http://" + hostName + ":" + tomcatPort + "/" + contextPath + "/index");

        String greetingMessage = with().header(new Header("Content-Type", "application/json; charset=UTF-8"))
                .expect().log().all()
                .when().get(testUrl.toString())
                .then().statusCode(200)
                .extract().path("greeting");

        Assert.assertEquals(greetingMessage, "Index Greeting");
    }
}
