package edu.btu.guramdvalishvili.services.implement;

import edu.btu.guramdvalishvili.dto.category.AddCategoryInput;
import edu.btu.guramdvalishvili.dto.category.CategoryDTO;
import edu.btu.guramdvalishvili.dto.category.GetCategoryByIdOutput;
import edu.btu.guramdvalishvili.models.Category;
import edu.btu.guramdvalishvili.repository.CategoryRepository;
import edu.btu.guramdvalishvili.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public GetCategoryByIdOutput getCategoryById() {

        GetCategoryByIdOutput getCategoriesOutput = new GetCategoryByIdOutput();
        List<CategoryDTO> categoryDTOList = new ArrayList<>();

        for (Category category : categoryRepository.findAll()) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(category.getId());
            categoryDTO.setTitle(category.getTitle());
            categoryDTOList.add(categoryDTO);
        }

        getCategoriesOutput.setCategoryDTOList(categoryDTOList);
        return getCategoriesOutput;
    }

    @Override
    public void AddCategory(AddCategoryInput addCategoryInput) {
        Category category = new Category();
        category.setTitle(addCategoryInput.getTitle());
        categoryRepository.save(category);
    }

}
