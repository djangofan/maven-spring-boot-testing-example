package example.spring.bootapp;

import org.junit.Before;

import java.net.MalformedURLException;
import java.net.URL;

public class IntegrationTestBase
{
    protected String tomcatPort;
    protected String hostName;
    protected String contextName;
    protected URL testUrl = null;

    @Before
    public void setUp() throws InterruptedException
    {
        tomcatPort = System.getProperty("tomcatPort", "8080");
        hostName = System.getProperty("hostName", "localhost");
        contextName = System.getProperty("contextName", "maven-spring-boot-testing-example");
        Thread.sleep(1000);
    }

    protected URL getURLFromString(String targetUrl)
    {
        URL testUrl = null;
        try
        {
            testUrl = new URL(targetUrl);
        }
        catch (MalformedURLException e)
        {
            //LOGGER.info("Error parsing url string.", e);
            e.printStackTrace();
        }
        return testUrl;
    }

}
