package edu.btu.guramdvalishvili.controller;

import edu.btu.guramdvalishvili.dto.movie.*;
import edu.btu.guramdvalishvili.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("getMovies")
    public GetMoviesOutput getMovies() {
        return movieService.getMovies();
    }

    @PostMapping("addMovie")
    public void addMovie(@RequestBody AddMovieInput addMovieInput) {
        movieService.addMovie(addMovieInput);
    }

    @PostMapping("getMovie/{id}")
    public GetMovieByIdOutput getMovieByIdOutput(@RequestBody GetMovieByIdInput getMovieByIdInput) {
        return movieService.getMovieById(getMovieByIdInput);
    }

    @PostMapping("deleteMovie")
    public void deleteMovie(@RequestBody DeleteMovieInput deleteMovieInput) {
        movieService.deleteMovie(deleteMovieInput);
    }
}
