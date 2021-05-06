FROM openjdk:8-alpine
EXPOSE 80
ADD Backend/RegistryBack/target/PruebaTecnica-1.0.0.jar /usr/share/app.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/app.jar"]