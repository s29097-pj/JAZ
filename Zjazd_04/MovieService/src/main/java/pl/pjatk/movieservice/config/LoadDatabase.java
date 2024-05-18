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
            repository.save(new Movie("Inception", "THRILLER"));
            repository.save(new Movie("The Matrix", "ACTION"));
            repository.save(new Movie("Interstellar", "THRILLER"));
            repository.save(new Movie("The Godfather", "CRIME"));
            repository.save(new Movie("Pulp Fiction", "CRIME"));
        };
    }
}
