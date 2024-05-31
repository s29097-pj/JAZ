package pl.pjatk.movieservice.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.pjatk.movieservice.model.Movie;
import pl.pjatk.movieservice.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(int id) {
        Optional<Movie> movie = movieRepository.findById((long) id);
        return movie.orElse(null);
    }

    public ResponseEntity<Movie> addMovie(Movie movie) {
        Movie savedMovie = movieRepository.save(movie);
        return ResponseEntity.ok(savedMovie);
    }

    public ResponseEntity<Movie> updateMovie(int id, Movie movie) {
        Optional<Movie> existingMovie = movieRepository.findById((long) id);
        if (existingMovie.isPresent()) {
            Movie updatedMovie = existingMovie.get();
            updatedMovie.setName(movie.getName());
            updatedMovie.setCategory(movie.getCategory());
            movieRepository.save(updatedMovie);
            return ResponseEntity.ok(updatedMovie);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> deleteMovie(int id) {
        Optional<Movie> existingMovie = movieRepository.findById((long) id);
        if (existingMovie.isPresent()) {
            movieRepository.delete(existingMovie.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Movie> setMovieAvailability(Long id, boolean isAvailable) {
        Optional<Movie> existingMovie = movieRepository.findById(id);
        if (existingMovie.isPresent()) {
            Movie movie = existingMovie.get();
            movie.setIsAvailable(isAvailable);
            movieRepository.save(movie);
            return ResponseEntity.ok(movie);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}