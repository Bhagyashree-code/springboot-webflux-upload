# springboot-webflux-upload
# Spring Boot WebFlux File Upload Service

A simple and scalable backend service built with **Spring Boot WebFlux** that supports **file uploads up to 50MB**.

This project demonstrates reactive programming, REST API design, and clean backend architecture suitable for real-world applications.

---

## 🚀 Features
- Reactive backend using **Spring WebFlux**
- File upload support up to **50MB**
- Non-blocking I/O
- Clean and minimal project structure
- Ready to integrate with React or other frontend frameworks

---

## 🛠️ Tech Stack
- Java 17
- Spring Boot
- Spring WebFlux
- Maven

---

## 📂 Project Structure
springboot-webflux-upload
├── src
│ └── main
│ ├── java/com/example/demo
│ │ ├── DemoApplication.java
│ │ └── UploadController.java
│ └── resources
│ └── application.properties
├── pom.xml
└── README.md


---

## ⚙️ Configuration
File upload limit configured in `application.properties`:

```properties
spring.webflux.multipart.max-file-size=50MB
spring.webflux.multipart.max-request-size=50MB

📡 API Endpoint
Upload File
POST /upload


Form-data

Key	Value
file	Select file
▶️ Run Locally
mvn spring-boot:run


Backend runs at:

http://localhost:8080

🌐 Future Enhancements

Multiple file upload

File type validation

Cloud storage (AWS S3)

Authentication & authorization
