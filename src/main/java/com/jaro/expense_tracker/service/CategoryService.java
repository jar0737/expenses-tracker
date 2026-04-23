package com.jaro.expense_tracker.service;

import com.jaro.expense_tracker.exceptions.ResourceNotFoundException;
import com.jaro.expense_tracker.model.Category;
import com.jaro.expense_tracker.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoryService {
    Category saveCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(Long id);

    void deleteCategory(Long id);
}
