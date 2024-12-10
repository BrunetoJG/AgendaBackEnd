
FROM maven:3.8.4-openjdk-17-slim AS build
COPY . /home/app/AgendaBackEnd
WORKDIR /home/app/AgendaBackEnd
RUN mvn -v
RUN mvn clean package


FROM openjdk:17-slim
COPY --from=build /home/app/AgendaBackEnd/target/agenda-backend-1.0.0.jar /usr/local/lib/agenda-backend.jar
VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/agenda-backend.jar"]