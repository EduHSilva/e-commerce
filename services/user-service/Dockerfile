FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml ./
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/target/user-service.jar user-service.jar
ENV SPRING_PROFILES_ACTIVE=docker
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "user-service.jar"]
