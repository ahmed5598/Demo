FROM openjdk:16-alpine
COPY ./target/demo-0.0.1-SNAPSHOT.jar /usr/src/myapp
WORKDIR /usr/src/myapp
#RUN javac ./src/main/java/com/example/demo/DemoApplication.java
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

#  $ docker build -t my-java-app .
#  $ docker run --rm -p 8080:8080 --name my-running-app my-java-app
