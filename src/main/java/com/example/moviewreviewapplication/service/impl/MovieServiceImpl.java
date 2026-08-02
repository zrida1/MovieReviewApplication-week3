package com.example.moviewreviewapplication.service.impl;

import com.example.moviewreviewapplication.dto.MovieRequestDTO;
import com.example.moviewreviewapplication.dto.MovieResponseDTO;
import com.example.moviewreviewapplication.entity.Movie;
import com.example.moviewreviewapplication.exception.ResourceNotFoundException;
import com.example.moviewreviewapplication.mapper.MovieMapper;
import com.example.moviewreviewapplication.repository.MovieRepository;
import com.example.moviewreviewapplication.service.MovieService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;
    public MovieServiceImpl(MovieRepository movieRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    public MovieResponseDTO getMovieById(Long id) {
        return movieMapper.toResponseDTO(movieRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Movie not found with id: " + id)));
    }

    public Page<MovieResponseDTO> getAllMovies(int page, int size, String sortBy) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending()
        );

        return movieRepository.findAll(pageable).map(movieMapper::toResponseDTO);
    }
    public MovieResponseDTO updateMovie(Long id, MovieRequestDTO dto) {
        Movie movie = movieRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Movie not found with id: " + id));
        movie.setTitle(dto.getTitle());
        movie.setDescription(dto.getDescription());
        movie.setGenre(dto.getGenre());
        movie.setReleaseYear(dto.getReleaseYear());
        movie.setImdbRating(dto.getImdbRating());
        return movieMapper.toResponseDTO(movieRepository.save(movie));

    }

    public void deleteMovie(Long id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Movie not found with id: " + id));

        movieRepository.delete(movie);
    }

    public MovieResponseDTO createMovie(MovieRequestDTO dto){
        return movieMapper.toResponseDTO(movieRepository.save(movieMapper.toEntity(dto)));

    }
}
