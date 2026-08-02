package com.example.moviewreviewapplication.service;

import com.example.moviewreviewapplication.dto.MovieRequestDTO;
import com.example.moviewreviewapplication.dto.MovieResponseDTO;
import org.springframework.data.domain.Page;

import java.util.List;


public interface MovieService {


    MovieResponseDTO getMovieById(Long id);

    Page<MovieResponseDTO> getAllMovies(int page, int size, String sortBy);
    MovieResponseDTO updateMovie(Long id, MovieRequestDTO dto);

    void deleteMovie(Long id);
    MovieResponseDTO createMovie(MovieRequestDTO dto);
}
