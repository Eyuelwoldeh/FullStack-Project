package com.artizanjw.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired // This framework instantiates/ initializes the class for us without constructor
    private MovieRepository movieRepository;

    public List<Movie> allMovies()
    {
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(ObjectId id) // Letting Java know with optional that we may not find a movie and it may return null
    {
        return movieRepository.findById(id);
    }
}
