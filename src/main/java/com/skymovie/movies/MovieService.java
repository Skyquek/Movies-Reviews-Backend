package com.skymovie.movies;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieById(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> findMovieByImdb(String imdb) {
        return movieRepository.findMovieByImdbId(imdb);
    }
}
