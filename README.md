# Cinema
This is a simple project designed to learn the Java, Spring, Hibernate, etc.

### Run Project
Create an empty database named `cinema`.
```
create database cinema DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;
```

Run `./mvnw flyway:migrate` to migrate the database then:

```
`./mvnw clean package`
./mvnw spring-boot:run
```

### IDE
Import the project into your `IDE` and run it as a Spring Boot application.
