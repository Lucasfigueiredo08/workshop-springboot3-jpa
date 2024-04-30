package br.com.lucasliberato.course.repositories;

import br.com.lucasliberato.course.entities.Category;
import br.com.lucasliberato.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
