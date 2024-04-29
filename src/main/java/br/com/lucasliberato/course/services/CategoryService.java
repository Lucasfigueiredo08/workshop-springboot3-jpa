package br.com.lucasliberato.course.services;

import br.com.lucasliberato.course.entities.Category;
import br.com.lucasliberato.course.entities.User;
import br.com.lucasliberato.course.repositories.CategoryRepository;
import br.com.lucasliberato.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category  = categoryRepository.findById(id);
        return category.get();
    }
}
