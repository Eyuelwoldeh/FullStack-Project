# My Movie Review Site

A full-stack application for managing and exploring movie data, including movie details, genres, reviews, and trailers. This project combines a React.js front-end with a Spring Boot back-end and uses MongoDB for data storage.

---

## 🚀 Features

- **Movie Collection**: Browse detailed information about movies, including titles, genres, release dates, trailers, and posters.
- **User Reviews**: Add and view user reviews for movies.
- **Responsive Design**: Optimized for seamless viewing across desktop and mobile devices.
- **RESTful APIs**: Clean and structured API endpoints for managing movie and review data.
- **Environment Configuration**: Secure credential handling via `.env` files.

---

## 🛠️ Tech Stack

- **Front-end**: React.js, React Router, Bootstrap, Material-UI Carousel
- **Back-end**: Spring Boot, Spring Data MongoDB, MongoTemplate
- **Database**: MongoDB
- **Environment Configuration**: `.env` files for secure handling of credentials and settings
- **Additional Tools**: Axios, FontAwesome

---

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

4. Start the front-end:
***
cd Front-end
npm install
npm start
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

---

### **POST /api/v1/reviews**
Submit a new review for a movie.

#### Example Request:
***
{
  "reviewBody": "Amazing movie! Must-watch.",
  "imdbId": "tt1234567"
}
***

#### Example Response:
***
{
  "id": "64d9f2c9a4b9e3d2a85c6f9c",
  "body": "Amazing movie! Must-watch."
}
***

---

## 🤝 Contributions

Contributions are welcome! Feel free to fork this repository and submit a pull request with your enhancements.

---

## 📜 License

This project is licensed under the Apache License 2.0.
