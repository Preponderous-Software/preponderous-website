FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy the Gradle wrapper, build.gradle and settings.gradle
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# Make the gradlew script executable
RUN chmod +x ./gradlew

# Copy the source code
COPY src src

# Disable Docker Compose support in Spring Boot
ENV SPRING_DOCKER_COMPOSE_ENABLED=false

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
CMD ["./gradlew", "bootRun"]