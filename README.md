# maven-spring-boot-testing-example
Meant to be a good example of a tested Maven Spring Boot project for beginners.

# How-To Manually Deploy WAR

1. Using Maven, run 'mvn clean package' to build the .war file.
2. Then, place the .war in your Tomcat webapps dir.
3. Navigate locally to http://localhost:8080/

# Running Unit Tests

1. Using Maven, run 'mvn clean install -Pdev'

# Running Integration Tests

NOTE: The integration tests start a Tomcat on localhost:9090 and runs those tests against that server instance.

1. Using Maven, run 'mvn clean install -Pintegration-test'
