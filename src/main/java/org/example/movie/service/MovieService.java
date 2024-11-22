package org.example.movie.service;

import org.example.movie.model.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private static final Logger logger = LoggerFactory.getLogger(MovieService.class);

    // Methods with logs
    public List<Movie> getAllMovies() {
        logger.info("Fetching all movies");
        return movieRepository.findAll();
    }

    public Movie getMovieById(String id) {
        logger.info("Fetching movie with id: {}", id);
        return movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));
    }

    // Other methods...
}
