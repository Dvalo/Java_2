package edu.btu.guramdvalishvili.services;

import edu.btu.guramdvalishvili.dto.category.AddCategoryInput;
import edu.btu.guramdvalishvili.dto.category.GetCategoryByIdOutput;

public interface CategoryService {
    GetCategoryByIdOutput getCategoryById();

    void AddCategory(AddCategoryInput addCategoryInput);
}
