FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY build/libs/ecoomerce-1.0.jar DiscoveryService.jar
ENTRYPOINT ["java", "-jar", "DiscoveryService.jar"]