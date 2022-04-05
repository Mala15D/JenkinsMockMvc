FROM openjdk:8
EXPOSE 9080
COPY test.jar /usr/local/bin/test.jar
CMD ["java","-jar","/usr/local/bin/test.jar"]
