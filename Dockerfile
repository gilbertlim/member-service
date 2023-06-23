FROM --platform=$BUILDPLATFORM openjdk:17.0.1
COPY build/libs/member-service-*-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "./app.jar"]