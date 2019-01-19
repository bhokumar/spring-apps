FROM bhoopendra/alpine-java:base

MAINTAINER bhoopendra.akgec

VOLUME /tmp

EXPOSE 1111

ARG JAR_FILE=build/libs/goodbye-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT sh -c 'java -jar /app.jar org.smartapps.goodbyeservice.GoodbyeServiceApplication.class'



