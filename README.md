# Movie Review Application

A Spring Boot REST API for managing movies, users, reviews, and categories with JWT authentication.

## Technologies

* Java 21
* Spring Boot
* Spring Security
* Spring Data JPA
* MySQL
* JWT
* MapStruct
* Lombok
* Swagger / OpenAPI

---

## Installation

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git
```

### 2. Create a MySQL database

```sql
CREATE DATABASE moviereviewapp;
```

### 3. Configure environment variables

Create the following environment variables (or configure them in your IDE):

| Variable    | Example                                     |
| ----------- | ------------------------------------------- |
| DB_URL      | jdbc:mysql://localhost:3306/moviereviewapp |
| DB_USERNAME | root                                        |
| DB_PASSWORD | your_password                               |
| SECRET      | your_jwt_secret_key                         |

---

## Running the application

Run the project using:

```bash
mvn spring-boot:run
```

or start it directly from IntelliJ IDEA.

---

## Features

* JWT Authentication
* User Registration & Login
* Role-Based Authorization
* CRUD Operations
* Pagination & Sorting
* Dynamic Filtering using Specification API
* JPQL & Native Queries
* Transaction Management
* N+1 Query Optimization using EntityGraph
* Transaction Rollback Tests
* Swagger API Documentation

---

## Swagger

After starting the application:

```
http://localhost:8080/swagger-ui/index.html
```

