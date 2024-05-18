package pl.pjatk.movieservice.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String director;
    private Integer release_year;
    private Double rating;

    public Movie() {
    }

    public Movie(String name, String category, String director, Integer release_year, Double rating) {
        this.name = name;
        this.category = category;
        this.director = director;
        this.release_year = release_year;
        this.rating = rating;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getReleaseYear() {
        return release_year;
    }

    public void setReleaseYear(Integer release_year) {
        this.release_year = release_year;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}