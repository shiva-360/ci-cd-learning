# Use  a java runtime image
FROM eclipse-temurin:21-jre

#set up working directory
WORKDIR /app

# copy the jar into container
COPY target/*.jar app.jar

#Expose the application port
EXPOSE 8080

#Run the application
ENTRYPOINT ["java" , "-jar" , "app.jar"]