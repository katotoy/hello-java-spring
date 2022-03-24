FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /opt
COPY target/hello-java-spring-0.0.1-SNAPSHOT /opt/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]