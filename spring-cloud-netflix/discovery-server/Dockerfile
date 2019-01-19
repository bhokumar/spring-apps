FROM bhoopendra/alpine-java:base

MAINTAINER bhoopendra.akgec

VOLUME /tmp

EXPOSE 8761

ARG JAR_FILE=build/libs/discovery-server-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT sh -c 'java -jar /app.jar org.smartapps.discoveryserver.DiscoveryServerApplication.class'



