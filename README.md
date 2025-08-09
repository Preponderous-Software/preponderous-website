# Preponderous Software Website

This is a Spring Boot application for the Preponderous Software website, built with Java 21, Gradle, and Docker support.

## About Preponderous Software

At Preponderous Software, we develop free and open-source games and assets, focusing on projects like Beyond Nations and Viron. Through these initiatives, we aim to provide valuable resources to the developer community, fostering collaboration and innovation in open-source software development.

## Key Projects

### Beyond Nations
A sandbox nation simulation RPG that allows players to explore a procedurally generated world, collect resources, and interact with various entities.

### Viron
A tool for creating and managing virtual environments and entities within those environments, intended for game development and other applications.

## Our Commitment to Open Source
- Free and open-source software
- Community-driven development
- Innovative game development tools
- Engaging sandbox experiences

## Prerequisites
- Java Development Kit (JDK) 21
- Docker and Docker Compose
- Gradle (or use the included Gradle wrapper)

## Building the Project
### Build with Gradle:

./gradlew build

### Build with Docker:
docker build -t preponderous-website .

## Running the Application
### Run with Gradle:
./gradlew bootRun

### Run with Docker:
docker run -p 8080:8080 preponderous-website

### Run with Docker Compose:
docker compose up

#### Or in detached mode
docker compose up -d

## Testing
Run the tests:

./gradlew test

## Technologies Used
- Java 21
- Spring Boot with Thymeleaf templating
- HTMX for dynamic content loading
- Bootstrap for responsive styling
- Lombok for reducing boilerplate code
- Docker for containerization

## Access the Application
After starting the application, access it at: http://localhost:8080

## 📄 License

This project is licensed under the **Preponderous Non-Commercial License (Preponderous-NC)**.  
It is free to use, modify, and self-host for **non-commercial** purposes, but **commercial use requires a separate license**.

> **Disclaimer:** *Preponderous Software is not a legal entity.*  
> All rights to works published under this license are reserved by the copyright holder, **Daniel McCoy Stephenson**.

Full license text:  
[https://github.com/Preponderous-Software/preponderous-nc-license/blob/main/LICENSE.md](https://github.com/Preponderous-Software/preponderous-nc-license/blob/main/LICENSE.md)
