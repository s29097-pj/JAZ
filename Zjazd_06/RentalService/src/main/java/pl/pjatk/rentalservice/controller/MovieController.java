package pl.pjatk.rentalservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.rentalservice.model.Movie;
import pl.pjatk.rentalservice.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable Long id) {
        return movieService.getMovie(id);
    }

    @PutMapping("/return/{id}")
    public void returnMovie(@PathVariable Long id) {
        movieService.returnMovie(id);
    }

    @PutMapping("/rent/{id}")
    public void rentMovie(@PathVariable Long id) {
        movieService.rentMovie(id);
    }
}