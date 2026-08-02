package com.example.moviewreviewapplication.dto;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({
        "id",
        "title",
        "genre",
        "releaseYear",
        "imdbRating",
        "description"
})
public class MovieResponseDTO {
    private Long id;
    private String title;
    private String description;
    private String genre;
    private Integer releaseYear;
    private Double imdbRating;

}
