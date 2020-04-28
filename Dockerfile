FROM openjdk:8
EXPOSE 9393
ADD target/spring-boot-docker-maven.jar spring-boot-docker-maven.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-maven.jar"]