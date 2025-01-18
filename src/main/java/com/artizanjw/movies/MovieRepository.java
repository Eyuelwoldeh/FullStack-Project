package com.artizanjw.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // we cant search imdb idea directly like we do for normal id since it is not already implemented

    Optional<Movie> findMovieByImdbId(String imdbId);
}
