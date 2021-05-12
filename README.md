# crud_boot
crud_boot is an API that is built on JAVA 8 using spring boot, JPA.

## Technology Stack on Development Computer
JAVA8
Eclipse
JPA
Hibernate
Docker
maven

## Unique Features
1. Enhanced error handling
2. Docker usage to ease deployment of application and database

## Instruction
From root folder of this project on command prompt, execute:
1. This command below will generate jar file on output without checking connection to postgre as postgre server is not available yet.
```bash
mvn clean install -DskipTests
```
2. Use this command to automate docker deployment process:
```bash
docker-compose up
```