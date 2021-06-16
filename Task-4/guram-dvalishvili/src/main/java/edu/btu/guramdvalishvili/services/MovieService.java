package edu.btu.guramdvalishvili.services;

import edu.btu.guramdvalishvili.dto.movie.*;

public interface MovieService {
    GetMoviesOutput getMovies();

    GetMovieByIdOutput getMovieById(GetMovieByIdInput getMovieByIdInput);

    void addMovie(AddMovieInput addMovieInput);

    void deleteMovie(DeleteMovieInput deleteMovieInput);
}
