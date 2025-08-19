# Skycart Models Location

A Spring Boot project for managing and testing the location feature, leveraging PostgreSQL as the database.

---

## Description

The **Skycart Models Location**  backend service allows managing geolocation data, including latitude, longitude, and timestamps. It provides a robust way to store and retrieve location information for different use cases. This service uses Spring Boot for rapid development, Hibernate as the ORM layer, and PostgreSQL for database storage. 

---

## Steps to Set Up the Project

### Step 1: Clone the Repository
1. Clone the repository from the source:
   ```bash
   git clone https://github.com/skycart-inc/skycart-java-backend/edit/main/models/skycart-models-location/locationtracking
Navigate to the project directory:
   ```bash
   cd skycart-models-location/locationtracking
   ```
### Step 2: Install Required Dependencies
Ensure you have the following installed on your system:

#### Java 11 or higher: Download here
#### Maven: Download here
#### PostgreSQL: Download here
#### Step 3: Configure PostgreSQL
Start the PostgreSQL Server
Ensure the PostgreSQL server is running.
Initialize the server if needed using pg_ctl commands or pgAdmin.
The server is not required to run the tests since the repositories are mocked but if you would like to setup the server, below explains how to setup the server. 
Create the Database and User

#### Log into the PostgreSQL shell:
```bash
psql -U postgres
```
Create a database:
```sql
CREATE DATABASE skycart;
```
Create a user with privileges:
```sql
CREATE USER vivek WITH PASSWORD 'vivek';
GRANT ALL PRIVILEGES ON DATABASE skycart TO vivek;
ALTER DATABASE skycart_models OWNER TO vivek;
```
#### Update application.properties
#### Open the application.properties file in the project.
Update the following details:
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/skycart
spring.datasource.username=vivek
spring.datasource.password=vivek
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```
### Step 4: Build and Run the Project
Use Maven to build the project:
```bash
mvn clean install
```
Run the application:
```bash
mvn spring-boot:run
```
### Step 5: Verify the Database
After starting the application, verify that the database tables have been created. Use the following commands in the PostgreSQL shell:
```sql
\c skycart_models
\dt
SELECT * FROM drone_locations;
```
### Running Tests

#### Step 1: Run Tests
Execute the following command to run the tests:

```bash
mvn test
```
#### Step 2: Verify Test Results
The test results will indicate success or failure. Check the logs for any issues.

#### Dependencies
The project uses the following key technologies:

Java 11: Backend programming language.
Spring Boot: Framework for rapid application development.
Hibernate: ORM for database interactions.
PostgreSQL: Relational database management system.
Maven: Dependency management and build tool.
