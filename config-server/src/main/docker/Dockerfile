FROM openjdk:8-jdk-alpine
MAINTAINER hien nguyen
#VOLUME /tmp
#ARG JAR_FILE
#ADD ${JAR_FILE} app.jar
ADD config-server.jar /usr/local/config-server/
WORKDIR /usr/local/config-server/
CMD ["java", "-Xms512m", "-Xmx1g", "-jar", "config-server.jar"]
#ENTRYPOINT ["java","-Djava.dosecurity.egd=file:/dev/./urandom","-jar","/app.jar"]




# RUN apk add --update curl && \
#     rm -rf /var/cache/apk/*

# ADD ./build/libs/configuration-microservice-0.0.1-SNAPSHOT.jar /app/
# CMD ["java", "-Xmx200m", "-jar", "/app/configuration-microservice-0.0.1-SNAPSHOT.jar"]

# EXPOSE 8002