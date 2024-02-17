# Use an appropriate base image with Java 17
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Java source code into the container
COPY src /app/src

# Copy the Maven project file
COPY pom.xml /app/pom.xml

# Copy the mvnw script and the .mvn directory into the container
COPY mvnw /app/mvnw
COPY .mvn /app/.mvn

# Compile the Java code
RUN ./mvnw package

# Copy the JAR file into the container
COPY target/scientific-calculator-1.0-SNAPSHOT.jar /app/scientific-calculator.jar

# Command to run the Java application
CMD ["java", "-jar", "target/scientific-calculator-1.0-SNAPSHOT.jar"]

#FROM openjdk:17-jdk-alpine
#WORKDIR /app
#COPY target/scientific-calculator-1.0-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java", "-jar", "app.jar"]
