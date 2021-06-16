package edu.btu.guramdvalishvili.services.implement;

import edu.btu.guramdvalishvili.dto.movie.*;
import edu.btu.guramdvalishvili.models.Movie;
import edu.btu.guramdvalishvili.repository.MovieRepository;
import edu.btu.guramdvalishvili.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public GetMoviesOutput getMovies() {
        List<MovieDTO> movieDTOList = new ArrayList<>();
        for (Movie movie : movieRepository.findAll()) {
            MovieDTO movieDTO = new MovieDTO();
            MovieDTO.setId(movie.getId());
            MovieDTO.setTitle(movie.getTitle());
            MovieDTO.setCountry(movie.getCountry());
            movieDTOList.add(MovieDTO);
        }

        GetMoviesOutput getMoviesOutput = new GetMoviesOutput();
        getMoviesOutput.setMovieDTOList(movieDTOList);
        return getMoviesOutput;
    }

    @Override
    public GetMovieByIdOutput getMovieById(GetMovieByIdInput getMovieByIdInput) {
        Movie movie = movieRepository.getById(getMovieByIdInput.getId());

        GetMovieByIdOutput getMovieByIdOutput = new GetMovieByIdOutput();
        getMovieByIdOutput.setId(movie.getId());
        getMovieByIdOutput.setTitle(movie.getTitle());
        getMovieByIdOutput.setCountry(movie.getCountry());

        return getMovieByIdOutput;
    }

    @Override
    public void addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());
    }

    @Override
    public void deleteMovie(DeleteMovieInput deleteMovieInput) {
        Movie movie = movieRepository.getById(deleteMovieInput.getId());
//        movie.getCategories().clear();
        movieRepository.delete(movie);
    }
}
