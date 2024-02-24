package org.fasttrackit.curs20.service;

import org.fasttrackit.curs20.model.Movie;
import org.fasttrackit.curs20.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public List<Movie>getAllMovies(){
        return movieRepository.findAll();
    }
}
