# Use Java 17 base image
FROM openjdk:17-jdk-slim

# Copy jar file
COPY target/ChatBotApplication-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java","-jar","/app.jar"]