package com.example.moviewreviewapplication.dto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MovieRequestDTO {
    @NotBlank(message = "Title cannot be empty")
    private String title;
    @NotBlank(message = "Description cannot be empty")
    private String description;
    @NotBlank(message = "Genre cannot be empty")
    private String genre;
    @NotNull(message = "Release year is required")
    @Min(1888)
    private Integer releaseYear;
    @NotNull(message = "IMDB rating is required")
    @Min(value = 0, message = "IMDB rating cannot be less than 0")
    @Max(value = 10, message = "IMDB rating cannot be greater than 10")
    private Double imdbRating;
}
