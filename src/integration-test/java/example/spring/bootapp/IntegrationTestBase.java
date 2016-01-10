package example.spring.bootapp;

import org.junit.Before;
import java.net.MalformedURLException;
import java.net.URL;

public class IntegrationTestBase
{
    protected String tomcatPort;
    protected String hostName;
    protected String contextPath;
    protected URL testUrl = null;

    @Before
    public void setUp() throws InterruptedException
    {
        tomcatPort = System.getProperty("tomcatPort");
        hostName = System.getProperty("hostName");
        contextPath = System.getProperty("contextPath");
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
