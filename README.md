# Expense Tracker

Welcome! This is a modern, full-stack Expense Tracker app designed to help you manage your expenses with real-time insights.

---

## What Can You Do With This App?

- **Sign up and log in** securely (using JWT authentication)
- **Add, edit, and delete expenses** as you go
- **See your expenses update in real time** (thanks to WebSockets)
- **All your data is safely stored** in MySQL (or H2 for local development)
- **Fast performance** with Redis caching
- **REST API is secured** with Spring Security
- **Easy to deploy**—the whole backend can run in Docker

---

## What's Under the Hood?

- **Backend:** Java 17, Spring Boot 3, Spring Data JPA, Spring Security, WebSockets
- **Database:** MySQL (or H2 for quick local testing)
- **Cache:** Redis
- **Frontend:** React (not included in this repo, but ready to connect)
- **API Docs:** Swagger/OpenAPI (use springdoc for Spring Boot 3+)
- **Containerization:** Docker

---

## How Do You Get Started?

### Prerequisites

You'll need:
- Java 17 or newer
- Maven
- MySQL (or just use H2 for local dev)
- Redis (optional, for caching)
- Docker (optional, for containerization)

### Setup Steps

1. **Clone the repository:**
   ```sh
   git clone https://github.com/deepthireddy246/expense-tracker.git
   cd expense-tracker/expensetracker
   ```

2. **Configure your database:**
   - Open `src/main/resources/application.yml` and set your DB details.
   - By default, it uses H2 for local development.

3. **Build and run the backend:**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the app:**
   - The API will be running at: [http://localhost:8080](http://localhost:8080)
   - If you enable Swagger UI, it'll be at: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### Want to Use Docker?

If you have a Dockerfile, you can build and run the backend like this:
```sh
docker build -t expense-tracker-backend .
docker run -p 8080:8080 expense-tracker-backend
```

---

## Project Structure

- `src/main/java/com/example/expensetracker` — All the backend code
- `src/main/resources` — Configuration files
- `pom.xml` — Maven build file

---

## License

This project is open source and licensed under the MIT License.

---

If you need help connecting the frontend, deploying, or want to add more features, just ask! 