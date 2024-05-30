package pl.pjatk.movieservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.pjatk.movieservice.model.Category;
import pl.pjatk.movieservice.model.Movie;
import pl.pjatk.movieservice.repository.MovieRepository;

@Configuration
public class LoadDatabase {

@Bean
CommandLineRunner initDatabase(MovieRepository repository) {
    return args -> {
        repository.save(new Movie("Inception", "THRILLER", "Christopher Nolan", 2010, 8.8));
        repository.save(new Movie("The Matrix", "ACTION", "Lana Wachowski, Lilly Wachowski", 1999, 8.7));
        repository.save(new Movie("Interstellar", "THRILLER", "Christopher Nolan", 2014, 8.6));
        repository.save(new Movie("The Godfather", "CRIME", "Francis Ford Coppola", 1972, 9.2));
        repository.save(new Movie("Pulp Fiction", "CRIME", "Quentin Tarantino", 1994, 8.9));
    };
}
}
