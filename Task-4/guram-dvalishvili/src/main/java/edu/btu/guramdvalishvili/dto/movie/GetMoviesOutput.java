package edu.btu.guramdvalishvili.dto.movie;

import lombok.Data;

import java.util.List;

@Data
public class GetMoviesOutput {
    List<MovieDTO> movieDTOList;

}
