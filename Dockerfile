FROM openjdk:17

WORKDIR /app

COPY ./target/PostsBackend.jar /app

EXPOSE 8080

CMD ["java", "-jar", "PostsBackend.jar"]