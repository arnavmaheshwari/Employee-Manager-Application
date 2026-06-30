# 🏢 Employee Manager Application

A full-stack web application designed for comprehensive employee record management. Built with an Angular frontend and a Spring Boot backend, it provides a seamless interface to maintain, update, and track employee data within an organization.

---

## 📖 Overview

The Employee Manager Application is designed to streamline administrative tasks by providing a centralized dashboard for employee management. It enables users to securely interface with a backend MySQL database through a robust Spring Boot RESTful API, facilitating end-to-end CRUD (Create, Read, Update, Delete) operations.

---

## ✨ Features

### Core Operations

* **View Directory:** Fetch and display a comprehensive list of all employees.
* **Search:** Retrieve detailed information for a specific employee using their unique ID.
* **Add Employee:** Create and register new employee profiles.
* **Update Records:** Modify existing employee information in real-time.
* **Delete Employee:** Remove former or invalid employee records from the system.

### Technical Features

* **RESTful Architecture:** Clean separation of concerns between client and server.
* **CORS Configured:** Backend explicitly configured to accept cross-origin requests from the frontend.
* **ORM Integration:** Automated database schema generation and querying utilizing Spring Data JPA and Hibernate.

---

## 🛠 Tech Stack

| Category | Technologies |
| --- | --- |
| **Frontend** | Angular (v16.1.0), TypeScript (v5.1.3), RxJS, HTML, CSS |
| **Backend** | Java 21, Spring Boot (v3.2.4), Spring Web, Spring Data JPA |
| **Database** | MySQL |
| **Build Tools** | Maven (Backend), Angular CLI (Frontend), npm |
| **Testing** | JUnit (Backend), Jasmine & Karma (Frontend) |

---

## 🏗 Architecture

The application relies on a standard multi-tier client-server architecture:

1. **Presentation Layer (Frontend):** An Angular SPA (Single Page Application) handles the UI and user interactions, utilizing HTTP clients to fetch and post data.
2. **Business Logic Layer (Backend):** A Spring Boot REST API processes HTTP requests, enforces application logic, and handles data mapping.
3. **Data Access Layer:** Spring Data JPA interfaces with the MySQL database to execute queries seamlessly without writing native SQL.

---

## 📂 Project Structure

```text
employee-manager-application/
├── EmployeeManagerBackEnd/          # Spring Boot Backend
│   ├── .mvn/                        # Maven wrapper configuration
│   ├── src/
│   │   ├── main/java/.../
│   │   │   ├── controller/          # REST API Controllers (EmployeeResource)
│   │   │   ├── exception/           # Custom Exception Handlers
│   │   │   ├── model/               # JPA Entities (Employee)
│   │   │   ├── repository/          # Data Access Interfaces
│   │   │   └── service/             # Business Logic (EmployeeService)
│   │   └── main/resources/
│   │       └── application.properties # Backend & Database configuration
│   ├── pom.xml                      # Maven dependencies
│   └── mvnw / mvnw.cmd              # Maven wrapper executables
│
└── EmployeeManagerFrontEnd/         # Angular Frontend
    ├── src/
    │   ├── app/
    │   │   ├── employee/            # Employee component logic & templates
    │   │   ├── employee.ts          # Employee data model interface
    │   │   ├── employee.service.ts  # HTTP client service for backend communication
    │   │   └── ...                  # Standard Angular routing and app modules
    │   ├── index.html               # Main HTML entry point
    │   └── styles.css               # Global stylesheets
    ├── package.json                 # Node.js dependencies
    └── angular.json                 # Angular workspace configuration

```

---

## 🚀 Getting Started

### Prerequisites

Ensure you have the following installed on your local machine:

* **Java Development Kit (JDK):** Version 21
* **Node.js & npm:** Latest LTS version
* **Angular CLI:** `npm install -g @angular/cli@16`
* **MySQL Server:** Running on port 3306
* **Maven:** (Optional, as the Maven wrapper `mvnw` is included)

### Installation

> **Note:** The backend and frontend must be run in separate terminal windows.

#### 1. Database Setup

Create a new MySQL database named `employeemanager`.

```sql
CREATE DATABASE employeemanager;

```

#### 2. Backend Setup

Navigate to the backend directory, configure your database credentials, and start the Spring Boot application.

```bash
cd EmployeeManagerBackEnd
# The application will automatically create/update tables on startup
./mvnw spring-boot:run

```

#### 3. Frontend Setup

Navigate to the frontend directory, install dependencies, and start the development server.

```bash
cd EmployeeManagerFrontEnd
npm install
ng serve

```

Access the application in your browser at `http://localhost:4200`.

---

## ⚙️ Environment Variables

The backend application requires the following properties to be configured in `EmployeeManagerBackEnd/src/main/resources/application.properties`.

| Variable | Description | Required | Default Value |
| --- | --- | --- | --- |
| `spring.datasource.url` | MySQL connection string | Yes | `jdbc:mysql://localhost:3306/employeemanager` |
| `spring.datasource.username` | Database username | Yes | `root` |
| `spring.datasource.password` | Database password | Yes | *(Must be configured)* |
| `spring.jpa.show-sql` | Toggle SQL query logging | No | `true` |
| `spring.jpa.hibernate.ddl-auto` | Database schema generation strategy | No | `update` |

---

## 🔌 API Documentation

The Spring Boot backend exposes the following RESTful endpoints running on `http://localhost:8080`.

| Method | Endpoint | Description |
| --- | --- | --- |
| `GET` | `/employee/all` | Retrieves a list of all employees. |
| `GET` | `/employee/find/{id}` | Retrieves details of a specific employee by ID. |
| `POST` | `/employee/add` | Creates and saves a new employee record. |
| `PUT` | `/employee/update` | Updates an existing employee's information. |
| `DELETE` | `/employee/delete/{id}` | Deletes an employee from the database by ID. |

---

## 🗄 Database

* **Engine:** MySQL
* **ORM:** Hibernate (configured via Spring Data JPA)
* **Migrations:** Managed automatically on application startup via `spring.jpa.hibernate.ddl-auto=update`. This instructs Hibernate to update the schema to match the `Employee` entity model without destroying existing data.

---

## 🧪 Testing

Both backend and frontend are pre-configured for automated testing.

**Backend (JUnit/Spring Boot Test):**

```bash
cd EmployeeManagerBackEnd
./mvnw test

```

**Frontend (Jasmine/Karma):**

```bash
cd EmployeeManagerFrontEnd
ng test

```

---

## 🔮 Future Improvements

* Implement Spring Security for JWT-based Authentication and Authorization.
* Add pagination and sorting for the employee list via Spring Data `Pageable`.
* Containerize the application using Docker and Docker Compose for easier environment setup.
* Add form validation and error handling on the Angular UI.
* Implement soft-deletion for employee records.

---

## 🤝 Contributing

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License.
