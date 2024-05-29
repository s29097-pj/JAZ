package pl.pjatk.movieservice.service;

import org.springframework.stereotype.Service;
import pl.pjatk.movieservice.model.Movie;
import pl.pjatk.movieservice.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

}
