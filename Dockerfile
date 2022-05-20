FROM anapsix/alpine-java:8_jdk_unlimited
ARG JAR_FILE=target/*.jar

# expose application
EXPOSE 8443
EXPOSE 8080

COPY ${JAR_FILE} api.jar
ENTRYPOINT ["java","-jar","/api.jar"]