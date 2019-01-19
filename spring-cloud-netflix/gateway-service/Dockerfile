FROM bhoopendra/alpine-java:base

MAINTAINER bhoopendra.akgec

VOLUME /tmp

EXPOSE 3000

ARG JAR_FILE=build/libs/gateway-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT sh -c 'java -jar /app.jar org.smartapps.gatewayservice.GatewayServiceApplication.class'



