Employee Management System
==========================

The Employee Management System is a Spring Boot application that provides APIs for managing employee records. It uses an H2 in-memory database for data storage and management.

---

## Technologies Used

- Java 17
- Spring Boot 3.2.1
- Spring Data JPA
- H2 Database (in-memory)
- Spring Web (Spring MVC)
- Lombok

## Features

- Retrieve all employees
- Retrieve an employee by ID
- Create a new employee
- Update an existing employee
- Delete an employee by ID
- Search employees by name

## Dependencies

- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- Spring Boot DevTools
- H2 Database (runtime)
- Lombok (optional)
- Spring Boot Starter Test (for testing)

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven build tool

### Installation

1. Clone the repository:
````
git clone https://github.com/NelushGayashan/employee-management-system.git
````

2. Navigate to the project directory:
````
cd employee-management-system
````

3. Build the project using Maven:
````
mvn clean package
````


---

## Usage

1. Run the application using Maven:
````
mvn spring-boot
````

2. The application will start at http://localhost:8080.

---

## Endpoints

- **GET /employees**: Retrieve all employees.
- **GET /employees/{id}**: Retrieve employee by ID.
- **GET /employees/{name}**: Retrieve employees by name.
- **POST /employees**: Create a new employee.
- **PUT /employees/{id}**: Update an existing employee.
- **DELETE /employees/{id}**: Delete an employee by ID.

---

## Testing

The project includes unit tests for the service layer using JUnit and Mockito. To run tests, use the following Maven command:
````
mvn test
````


---

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your improvements.

---

## License

This project is licensed under the MIT License. See the LICENSE file for details.
