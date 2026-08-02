package com.example.moviewreviewapplication.mapper;

import com.example.moviewreviewapplication.dto.MovieRequestDTO;
import com.example.moviewreviewapplication.dto.MovieResponseDTO;
import com.example.moviewreviewapplication.entity.Movie;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    MovieRequestDTO toRequestDTO(Movie movie);

    MovieResponseDTO toResponseDTO(Movie movie);
    List<MovieResponseDTO> toResponseDTOList(List<Movie> movies);

    Movie toEntity(MovieRequestDTO dto);

    Movie toEntity(MovieResponseDTO dto);
}