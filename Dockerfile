FROM openjdk:11
LABEL mantainer="eduardo.higashi.dev@gmail.com"
VOLUME /app
ADD build/libs/com.eduardo:crud:jar:0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]