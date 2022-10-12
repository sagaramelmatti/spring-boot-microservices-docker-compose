From openjdk:8
VOLUME /tmp
ADD target/customer-microservice-*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]