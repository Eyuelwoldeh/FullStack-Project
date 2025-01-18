# 🎬 Movies API

A Spring Boot-based RESTful API for managing and exploring movie data, including movie details, genres, reviews, and more. This project leverages MongoDB for flexible and scalable data storage.

---

## 🚀 Features

- **Movies Collection**: Store and retrieve details about movies such as titles, genres, release dates, trailers, and more.
- **Reviews Integration**: Add and manage user reviews linked to movies.
- **RESTful Endpoints**: Access movie data via clean and structured API endpoints.
- **Scalable Architecture**: Built with Spring Boot and MongoDB for robust and scalable back-end solutions.
- **Environment Configuration**: Easily configurable through `.env` files for secure handling of credentials and settings.

---

## 🛠️ Tech Stack

- **Backend Framework**: Spring Boot 3.4.1
- **Database**: MongoDB with Spring Data MongoDB
- **Language**: Java 17
- **Environment Configuration**: `spring-dotenv`

---

## 📁 Project Structure

```plaintext
eyuelwoldeh-fullstack-project/
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/com/artizanjw/movies/
│   │   │   ├── Movie.java
│   │   │   ├── MovieController.java
│   │   │   ├── MovieRepository.java
│   │   │   ├── MovieService.java
│   │   │   ├── MoviesApplication.java
│   │   │   └── Review.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   └── .env.example
│   └── test/java/com/artizanjw/movies/
│       └── MoviesApplicationTests.java
└── .mvn/wrapper/
    └── maven-wrapper.properties
```
***

---

## 📦 Installation

1. Clone the repository:
***
git clone https://github.com/your-username/movies-api.git
cd movies-api
***

2. Set up your environment variables:
   - Create a `.env` file in the `src/main/resources` directory based on `.env.example`:
     ***
     MONGO_DATABASE=your_database_name
     MONGO_USER=your_username
     MONGO_PASSWORD=your_password
     MONGO_CLUSTER=your_cluster_url
     ***

3. Build and run the application:
***
./mvnw spring-boot:run
***

4. Access the API at:
***
http://localhost:8080/api/v1/movies
***

---

## 🧪 Endpoints

### **GET /api/v1/movies**
Retrieve a list of all movies.

#### Example Response:
***
[
  {
    "id": "64d9f2c9a4b9e3d2a85c6f9b",
    "imdbId": "tt1234567",
    "title": "Inception",
    "releaseDate": "2010-07-16",
    "trailerLink": "https://www.youtube.com/watch?v=YoHD9XEInc0",
    "poster": "https://image-url.com/inception-poster.jpg",
    "genres": ["Action", "Sci-Fi"],
    "backdrops": ["https://image-url.com/backdrop1.jpg"],
    "reviewIds": []
  }
]
***
