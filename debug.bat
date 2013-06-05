set classpath=.
set MAVEN_OPTS=-Xms512m -Xmx1200m -XX:MaxPermSize=180m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=4000
call mvn jetty:run 
