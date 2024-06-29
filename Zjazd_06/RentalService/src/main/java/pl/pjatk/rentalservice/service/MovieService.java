package pl.pjatk.rentalservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.rentalservice.model.Movie;

import java.util.List;

@Service
public class MovieService {

    private final RestTemplate restTemplate;

    @Autowired
    public MovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Long id) {
        try {
            return restTemplate.getForObject("http://localhost:8081/movies/" + id, Movie.class);
        } catch (HttpClientErrorException.NotFound ex) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "Movie not found");
        } catch (HttpClientErrorException.BadRequest ex) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Bad request");
        } catch (HttpServerErrorException.InternalServerError ex) {
            throw new HttpServerErrorException(HttpStatus.BAD_GATEWAY, "Internal server error");
        } catch (ResourceAccessException ex) {
            throw new HttpServerErrorException(HttpStatus.GATEWAY_TIMEOUT, "Connection error");
        }
    }

    public void returnMovie(Long id) {
        try {
            restTemplate.put("http://localhost:8081/movies/return/" + id, null);
        } catch (HttpClientErrorException.NotFound ex) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "Movie not found");
        } catch (HttpClientErrorException.BadRequest ex) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Bad request");
        } catch (HttpServerErrorException.InternalServerError ex) {
            throw new HttpServerErrorException(HttpStatus.BAD_GATEWAY, "Internal server error");
        } catch (ResourceAccessException ex) {
            throw new HttpServerErrorException(HttpStatus.GATEWAY_TIMEOUT, "Connection error");
        }
    }

    public void rentMovie(Long id) {
        try {
            restTemplate.put("http://localhost:8081/movies/rent/" + id, null);
        } catch (HttpClientErrorException.NotFound ex) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "Movie not found");
        } catch (HttpClientErrorException.BadRequest ex) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Bad request");
        } catch (HttpServerErrorException.InternalServerError ex) {
            throw new HttpServerErrorException(HttpStatus.BAD_GATEWAY, "Internal server error");
        } catch (ResourceAccessException ex) {
            throw new HttpServerErrorException(HttpStatus.GATEWAY_TIMEOUT, "Connection error");
        }
    }


    public List<Movie> getAllMovies() {
        try {
            return List.of(restTemplate.getForObject("http://localhost:8081/movies/", Movie[].class));
        } catch (HttpClientErrorException.NotFound ex) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "Movies not found");
        } catch (HttpClientErrorException.BadRequest ex) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Bad request");
        } catch (HttpServerErrorException.InternalServerError ex) {
            throw new HttpServerErrorException(HttpStatus.BAD_GATEWAY, "Internal server error");
        } catch (ResourceAccessException ex) {
            throw new HttpServerErrorException(HttpStatus.GATEWAY_TIMEOUT, "Connection error");
        }
    }
}