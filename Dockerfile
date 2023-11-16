FROM openjdk:22-slim

WORKDIR /app

CMD ["./gradlew", "clean", "bootJar"]
COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
