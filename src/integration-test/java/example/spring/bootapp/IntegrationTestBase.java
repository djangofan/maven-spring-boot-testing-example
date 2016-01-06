package example.spring.bootapp;

import org.junit.Before;

public class IntegrationTestBase
{
    protected String tomcatPort;
    protected String hostName;
    protected String contextName;

    @Before
    public void setUp() throws InterruptedException
    {
        tomcatPort = System.getProperty("tomcat.http.port");
        hostName = System.getProperty("hostName");
        contextName = System.getProperty("contextName");
        Thread.sleep(60000);
    }

}
