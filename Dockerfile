FROM openjdk:17

WORKDIR /app

# COPY ./target/PostsBackend.jar /app

EXPOSE 8080

ADD target/PostsBackend.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
# CMD ["java", "-jar", "PostsBackend.jar"]
