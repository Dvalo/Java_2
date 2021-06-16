package edu.btu.guramdvalishvili.controller;

import edu.btu.guramdvalishvili.dto.category.AddCategoryInput;
import edu.btu.guramdvalishvili.dto.category.GetCategoryByIdInput;
import edu.btu.guramdvalishvili.dto.category.GetCategoryByIdOutput;
import edu.btu.guramdvalishvili.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("getCategoryById/{id}")
    public GetCategoryByIdOutput getCategories(@RequestBody GetCategoryByIdInput getCategoriesInput) {
        return categoryService.getCategoryById(getCategoriesInput);
    }

    @PostMapping("addCategory")
    public void addCategory(@RequestBody AddCategoryInput addCategoryInput){
        categoryService.AddCategory(addCategoryInput);
    }

}
