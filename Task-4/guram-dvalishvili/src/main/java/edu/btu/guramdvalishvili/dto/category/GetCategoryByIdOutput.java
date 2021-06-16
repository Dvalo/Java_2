package edu.btu.guramdvalishvili.dto.category;

import lombok.Data;

import java.util.List;

@Data
public class GetCategoryByIdOutput {
    private List<CategoryDTO> categoryDTOList;
}
