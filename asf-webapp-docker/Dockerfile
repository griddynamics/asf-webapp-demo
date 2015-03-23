# Version: 0.0.1
FROM tomcat:7.0.59-jre7
MAINTAINER Grigory Silantyev <gsilantyev@griddynamics.com>

ENV DB hsql
WORKDIR $CATALINA_HOME

ADD run_tomcat.sh /run_tomcat.sh
ADD target/files/spring-petclinic.war /usr/local/tomcat/webapps/asf-webapp-demo.war 

CMD "/run_tomcat.sh"
EXPOSE 8080
