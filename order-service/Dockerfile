# Sıfır bir linux makinemiz var, projeyi nasıl kurarım?
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Projenin tamamını kopyala (pom.xml dahil)
COPY . /app

RUN mvn clean package -DskipTests
# -----------------------------------
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]