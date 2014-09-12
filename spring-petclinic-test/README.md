Requisites:
- Binary repository for GD JBehave Framework  
  https://nexus.griddynamics.net/nexus/content/repositories/gd_jbehave_framework-snapshots  
  should be added to Maven repositories in `settings.xml`.
  It requires authentication so it should be configured properly.

Run UI test against a remote WebDriver:

    mvn -P integration-test clean verify \
        -Dspring.profiles.active=remote \
        -DREMOTE_WEBDRIVER_URL=http://localhost:4444/wd/hub -Dbrowser.version= \
        -Dpetclinic.url=http://localhost:9966/petclinic \
        [ -Dthreads=1 ] \
        [ -Dsuite.all=**/*Suite.java ] [ -Dsuite.list=UITestsExampleSuite ] \
        [ -Dmeta.filters=-not_impl,-not_in_func,-blocked,-non_ci ]

Run web service tests using an embedded Tomcat container with provided version
of Petclinic app:

    mvn -P functional-test clean verify \
        -Dpetclinic.version=1.0.0-SNAPSHOT \
        [ -DhttpPort=9966 ] \
        [ -Dthreads=1 ] \
        [ -Dsuite.all=**/*Suite.java ] [ -Dsuite.list=WebServicesExampleSuite ] \
        [ -Dmeta.filters=-not_impl,-not_in_func,-blocked,-non_ci ]

