# 💸 Expense Tracker with Real-Time Insights

Hi! I'm Deepthi Reddy Kallam — this is a full-stack web application I built to help users manage personal finances in a more interactive and intelligent way.

The app allows users to track expenses and income, get real-time budget alerts, and visualize spending trends with dynamic charts — all powered by modern Java, Spring Boot, React.js, WebSocket, and Docker.

---

## ✨ Features

- 🔐 User registration & login with JWT authentication
- ➕ Add, edit, delete income and expense entries
- 📊 Interactive dashboard with real-time charts (Chart.js)
- 📣 Budget alerts via WebSocket notifications
- ⚙️ REST APIs with Swagger documentation
- 🧠 Redis caching for improved performance
- 🐳 Fully Dockerized for easy deployment

---

## 🔧 Tech Stack

### 🔹 Backend
- Java 17, Spring Boot
- Spring Security (JWT Auth)
- Spring WebSocket
- Spring Data JPA + Hibernate
- MySQL
- Redis
- Swagger (SpringDoc)

### 🔹 Frontend
- React.js (with Hooks)
- Axios for API communication
- Chart.js for data visualization
- WebSocket client

### 🔹 DevOps
- Docker & Docker Compose

---

## 📁 Project Structure

├── backend/
│ ├── src/main/java/com/deepthi/expensetracker/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── repository/
│ │ ├── entity/
│ │ ├── security/
│ │ ├── config/
│ │ └── ExpensetrackerApplication.java
│ ├── resources/application.yml
│ └── Dockerfile

├── frontend/
│ ├── src/
│ │ ├── components/
│ │ ├── pages/
│ │ ├── services/
│ │ └── App.js
│ └── Dockerfile

├── docker-compose.yml
└── README.md

yaml
Copy
Edit

---

## ▶️ Getting Started

### Prerequisites

- Docker & Docker Compose installed

### To Run the App Locally

```bash
docker-compose up --build
Once all services are up:

Frontend: http://localhost:3000

Backend API: http://localhost:8080

Swagger UI: http://localhost:8080/api-docs


--->Screenshot attached in the folder

