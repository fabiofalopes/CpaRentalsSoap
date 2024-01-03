# Use an official Tomcat runtime as a parent image
FROM tomcat:9-jdk17-openjdk

# Set the working directory in the container to /usr/local/tomcat/webapps
WORKDIR /usr/local/tomcat/webapps

# Copy the current directory contents (your WAR file) into the container at /usr/local/tomcat/webapps
COPY ./CpaRentalsSoapUtility999.war /usr/local/tomcat/webapps/CpaRentalsSoapUtility999.war
# Make port 8080 available to the world outside this container
EXPOSE 8080

