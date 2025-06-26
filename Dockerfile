FROM eclipse-temurin:21-jdk

WORKDIR /app

# Create .gradle directory with proper permissions
RUN mkdir -p /home/app/.gradle && chmod -R 777 /home/app/.gradle

# Copy the Gradle wrapper, build.gradle and settings.gradle
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# Make the gradlew script executable
RUN chmod +x ./gradlew

# Configure Gradle to use the daemon
ENV GRADLE_OPTS="-Dorg.gradle.daemon=true -Dorg.gradle.configureondemand=true -Dorg.gradle.parallel=true"

# Environment variables for Spring Boot DevTools
ENV SPRING_DEVTOOLS_RESTART_ENABLED=true
ENV SPRING_DEVTOOLS_LIVERELOAD_ENABLED=true

# Disable Docker Compose support in Spring Boot
ENV SPRING_DOCKER_COMPOSE_ENABLED=false

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application with development options
CMD ["./gradlew", "bootRun", "--no-daemon", "-Dspring-boot.run.jvmArguments='-Dspring.devtools.restart.enabled=true -Dspring.devtools.livereload.enabled=true'"]