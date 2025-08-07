# 🐣 Examina – Microservice-Based Online Exam System

A cozy and modular microservice-based platform for managing online exams, quizzes, results, and user roles. Built using Spring Boot and modern backend architecture for scalability, flexibility, and developer happiness.

---

## 📌 Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Tech Stack](#tech-stack)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Folder Structure](#folder-structure)
- [Future Improvements](#future-improvements)
- [Contributing](#contributing)
- [License](#license)

---

## 📝 Overview

**Examina** is a distributed system designed to simplify the management of online tests. Whether it's academic exams, corporate assessments, or fun quizzes—Examina helps manage everything in a modular, scalable, and developer-friendly way.

---

## 🏛 Architecture

Examina uses microservices to encapsulate different responsibilities such as user management, exams, question banks, and result processing.

```plaintext
+------------------+        +--------------------+        +------------------+
|   User Service   | <----> |   Exam Service     | <----> | Question Service |
+------------------+        +--------------------+        +------------------+
                                     |
                                     v
                          +------------------------+
                          |   Result/Evaluation    |
                          +------------------------+
```

Optional components:
- API Gateway
- Eureka Discovery Server
- Config Server
- Message Broker (RabbitMQ/Kafka)

---

## 🧰 Tech Stack

- **Language:** Java 17+
- **Framework:** Spring Boot
- **Database:** MySQL / MongoDB
- **Communication:** REST APIs
- **Dependency Management:** Maven
- **Service Registry:** Spring Cloud Netflix Eureka *(optional)*
- **API Gateway:** Spring Cloud Gateway *(optional)*
- **Configuration:** Spring Cloud Config *(optional)*
- **Containerization:** Docker *(optional)*

---

## ✨ Features

- 🧑‍💼 Role-based access (Admin, Examiner, Student)
- 📝 Exam and question creation with customizable rules
- ⏰ Time-bound tests
- ⚖️ Auto-evaluation and scoring
- 📊 Result tracking
- 📦 Clean microservice separation

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven
- MySQL or any configured database
- (Optional) Docker, Docker Compose

### Installation

```bash
# Clone the repository
git clone https://github.com/FirdausJawed/Exam-wala-microservice-project.git
cd Exam-wala-microservice-project

# Build the project
mvn clean install

# Run individual microservices
cd user-service
mvn spring-boot:run

# Repeat for each service
```

---

## 📌 Usage

API examples (assuming default port 8080):

### Create a new user

```http
POST /api/users
Content-Type: application/json

{
  "username": "john123",
  "password": "securePass",
  "role": "STUDENT"
}
```

### Create an exam

```http
POST /api/exams
Content-Type: application/json

{
  "title": "Java Basics",
  "duration": 30,
  "totalMarks": 100
}
```

---

## 📁 Folder Structure

```bash
Examina/
│
├── user-service/
├── exam-service/
├── question-service/
├── result-service/
├── gateway-service/           # optional
├── config-server/             # optional
├── discovery-server/          # optional
└── README.md
```

---

## 🛠 Future Improvements

- Add Docker Compose for local orchestration
- Implement JWT-based authentication
- Add message broker for decoupled communication
- Frontend (React/Vue) integration
- Circuit Breakers & Retry patterns

---

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repo
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Create a new Pull Request

---

## 🧾 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙋‍♂️ Author

**Firdaus Jawed**  
[GitHub](https://github.com/FirdausJawed)
