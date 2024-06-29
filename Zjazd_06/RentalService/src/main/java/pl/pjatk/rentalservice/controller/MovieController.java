package pl.pjatk.rentalservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.rentalservice.model.Movie;
import pl.pjatk.rentalservice.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @Operation(summary = "Get a movie by id", description = "Returns a movie as per the id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
            @ApiResponse(responseCode = "404", description = "Not found - The movie was not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable("id") @Parameter(name = "id", description = "Movie id", example = "1") Long id) {
        return ResponseEntity.ok(movieService.getMovie(id));
    }

    @Operation(summary = "Return a movie by id", description = "Returns a movie as per the id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully returned"),
            @ApiResponse(responseCode = "404", description = "Not found - The movie was not found")
    })
    @PutMapping("/return/{id}")
    public ResponseEntity<Void> returnMovie(@PathVariable("id") @Parameter(name = "id", description = "Movie id", example = "1") Long id) {
        movieService.returnMovie(id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Rent a movie by id", description = "Rents a movie as per the id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully rented"),
            @ApiResponse(responseCode = "404", description = "Not found - The movie was not found")
    })
    @PutMapping("/rent/{id}")
    public ResponseEntity<Void> rentMovie(@PathVariable("id") @Parameter(name = "id", description = "Movie id", example = "1") Long id) {
        movieService.rentMovie(id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get all movies", description = "Returns a list of all movies")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved list"),
        @ApiResponse(responseCode = "404", description = "Not found - No movies were found")
})
@GetMapping("/")
public ResponseEntity<List<Movie>> getAllMovies() {
    List<Movie> movies = movieService.getAllMovies();
    if (movies.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(movies, HttpStatus.OK);
}
}