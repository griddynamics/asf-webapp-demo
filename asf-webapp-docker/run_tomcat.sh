#!/bin/bash -xv

if [ ${DB} == 'mysql' ]; then
  export CATALINA_OPTS="${CATALINA_OPTS} \
  -Djdbc.driverClassName=com.mysql.jdbc.Driver \
  -Djdbc.url=jdbc:mysql://${MYSQL_PORT_3306_TCP_ADDR}:${MYSQL_PORT_3306_TCP_PORT}/petclinic \
  -Djdbc.username=root \
  -Djdbc.password=${MYSQL_ENV_MYSQL_ROOT_PASSWORD} \
  -Djdbc.initLocation=classpath:db/mysql/initDB.sql \
  -Djdbc.dataLocation=classpath:db/mysql/populateDB.sql \
  -Dhibernate.dialect=org.hibernate.dialect.MySQLDialect \
  -Djpa.database=MYSQL"
fi

${CATALINA_HOME}/bin/catalina.sh run