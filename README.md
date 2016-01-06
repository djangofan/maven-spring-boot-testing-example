# maven-spring-boot-testing-example
Meant to be a good example of a Maven Spring Boot project for beginners that is tested bottom-up, starting with unit
tests and then integration tested as a Tomcat web application module.   The unit tests, by nature, may mock certain
parts of the system and test within a black box.   The integration tests will start an application server and
test the system modules as a whole.

This project is arranged the way that it is so that the project can be built for continuous integration, while
enabling developers to fully test components before they check in their code.  The purpose of integration testing
is to verify functional, performance, and reliability requirements placed on major design items.

# How-To Manually Deploy WAR

1. Using Maven, run 'mvn clean package' to build the .war file.
2. Then, place the .war in your Tomcat webapps dir.
3. Navigate locally to http://localhost:8080/

# Running just the Unit Tests

1. Using Maven, run 'mvn clean verify' (for default profile) OR 'mvn clean verify -Pdev'

# Running just the Integration Tests

NOTE: The integration-test phase will start a Tomcat on localhost, using a random port, and runs the tests against
that server instance.

1. Using Maven, run 'mvn clean verify -Pintegration-test'
