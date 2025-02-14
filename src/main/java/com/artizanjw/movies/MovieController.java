package com.artizanjw.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.bson.types.ObjectId;

import java.util.Optional;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") // Allow CORS requests from local host frontend
@RestController
@RequestMapping("/api/v1/movies") // Append this to the existing localhost url in order to navigate to the output page.
public class MovieController {

    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies()
    {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) // Whatever we get from the getmapping we want to convert it inton id with type Objectid
    {
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
