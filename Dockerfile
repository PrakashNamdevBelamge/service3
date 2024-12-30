FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/service-three.jar service-three.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "service-three.jar"]