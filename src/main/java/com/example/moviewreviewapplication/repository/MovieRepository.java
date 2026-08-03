package com.example.moviewreviewapplication.repository;

import com.example.moviewreviewapplication.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByGenre(String genre);
    List<Movie> findByReleaseYear(Integer releaseYear);
    List<Movie> findByImdbRatingGreaterThanEqual(Double rating);
    List<Movie> findByTitleContainingIgnoreCase(String title);
}
