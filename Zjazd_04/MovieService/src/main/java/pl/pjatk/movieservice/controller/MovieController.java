package pl.pjatk.movieservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.movieservice.model.Movie;
import pl.pjatk.movieservice.exception.MovieNotFoundException;
import pl.pjatk.movieservice.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) throws MovieNotFoundException {
        Movie movie = movieService.getMovieById(id);
        return ResponseEntity.ok(movie);
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable int id, @RequestBody Movie movie) throws MovieNotFoundException {
        return movieService.updateMovie(id, movie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) throws MovieNotFoundException {
        return movieService.deleteMovie(id);
    }

    @PatchMapping("/{id}/availability")
    public ResponseEntity<Movie> setMovieAvailability(@PathVariable Long id) {
        return movieService.setMovieAvailability(id, true);
    }

}