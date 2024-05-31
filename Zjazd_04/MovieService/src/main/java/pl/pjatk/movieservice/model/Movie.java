package pl.pjatk.movieservice.model;

import jakarta.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String director;

    @Column(name = "release_year")
    private Integer releaseYear;

    private Double rating;

    @Column(name = "is_available", nullable = false, columnDefinition = "boolean default false")
    private Boolean isAvailable = false;

    public Movie() {
    }

    public Movie(String name, String category, String director, Integer releaseYear, Double rating) {
        this.name = name;
        this.category = category;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
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
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setIsAvailable(boolean isAvailable) {
    }
}