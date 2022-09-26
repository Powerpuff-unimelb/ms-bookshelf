#
# Build stage
#
FROM maven:3.8.1-openjdk-17-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
EXPOSE 8085
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /home/app/target/ms-bookshelf-0.0.1-SNAPSHOT.jar /usr/local/lib/ms-bookshelf.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/usr/local/lib/ms-bookshelf.jar"]