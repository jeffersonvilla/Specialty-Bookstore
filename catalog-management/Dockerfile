FROM openjdk:21
WORKDIR /opt
EXPOSE 8080
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=pass
ENV SPRING_DATASOURCE_URL=jdbc:mysql://mysql-prueba:3306/specialty_bookstore
COPY target/*.jar /opt/app.jar
ENTRYPOINT [ "java", "-jar", "/opt/app.jar" ]