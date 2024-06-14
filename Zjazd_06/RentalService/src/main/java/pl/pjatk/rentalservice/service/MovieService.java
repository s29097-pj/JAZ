package pl.pjatk.rentalservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.rentalservice.model.Movie;

@Service
public class MovieService {

    private final RestTemplate restTemplate;

    @Autowired
    public MovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Long id) {
        return restTemplate.getForObject("http://localhost:8081/movies/" + id, Movie.class);
    }

    public void returnMovie(Long id) {
        restTemplate.put("http://localhost:8081/movies/return/" + id, null);
    }

    public void rentMovie(Long id) {
        restTemplate.put("http://localhost:8081/movies/rent/" + id, null);
    }
}