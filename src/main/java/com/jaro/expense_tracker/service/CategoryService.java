package com.jaro.expense_tracker.service;

import com.jaro.expense_tracker.model.Category;
import com.jaro.expense_tracker.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // CREATE / UPDATE
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // GET ALL
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // GET ONE
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    // DELETE
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
