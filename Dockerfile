FROM maven:3.8.4-openjdk-17-slim AS build
COPY . /home/app/agenda-backend
RUN mvn -v
RUN mvn -f /home/app/agenda-backend/pom.xml clean package


#Step 2 - Run appointment-backend
FROM openjdk:17-slim
COPY --from=build /home/app/agenda-backend/target/*.jar /usr/local/lib/agenda-backend.jar
VOLUME /tmp
EXPOSE 8080:8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/agenda-backend.jar"]