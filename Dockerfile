FROM openjdk:8
LABEL maintainer="rohitrathour"
ADD target/spring-flow-check-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]