CREATE DATABASE MovieServiceDB;

USE MovieServiceDB;

CREATE TABLE Movie (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(100) NOT NULL,
    director VARCHAR(255),
    release_year INT,
    rating DECIMAL(3,1),
    is_available BOOLEAN NOT NULL DEFAULT FALSE
);

INSERT INTO Movie (name, category, director, release_year, rating, is_available) VALUES
('Inception', 'Thriller', 'Christopher Nolan', 2010, 8.8, FALSE),
('The Matrix', 'Action', 'Andy Wachowski, Larry Wachowski', 1999, 8.7, FALSE),
('Interstellar', 'Thriller', 'Christopher Nolan', 2014, 8.6, FALSE),
('The Godfather', 'Crime', 'Francis Ford Coppola', 1972, 9.2, FALSE),
('Pulp Fiction', 'Crime', 'Quentin Tarantino', 1994, 8.9, FALSE);

SELECT * FROM Movie;