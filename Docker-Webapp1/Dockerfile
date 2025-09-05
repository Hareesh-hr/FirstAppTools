FROM tomcat:10.0-jdk17

# Copy WAR file to Tomcat webapps folder
COPY target/Docker-webapp1.war /usr/local/tomcat/webapps/ROOT.war

# Expose Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
