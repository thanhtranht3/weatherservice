FROM openjdk:8
ADD target/weatherservice.jar weatherservice.jar
# specify the port number the container should expose
EXPOSE 3000

# run the application
ENTRYPOINT ["java","-jar",  "weatherservice.jar"]