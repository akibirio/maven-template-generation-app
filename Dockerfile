# Use the official OpenJDK 17 image as the base image
FROM adoptopenjdk:17-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your target directory to the container
COPY target/maven-template-generator-0.0.1-SNAPSHOT.jar /app/template-gen-app.jar

# Expose the port that your microservice will run on (change as needed)
EXPOSE 8080

# Define the command to run your microservice
CMD ["java", "-jar", "template-gen-app.jar"]
