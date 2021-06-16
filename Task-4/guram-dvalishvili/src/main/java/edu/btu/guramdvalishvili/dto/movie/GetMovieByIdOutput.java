package edu.btu.guramdvalishvili.dto.movie;

import lombok.Data;

@Data
public class GetMovieByIdOutput {
    private Long id;
    private String title;
    private String country;
}
