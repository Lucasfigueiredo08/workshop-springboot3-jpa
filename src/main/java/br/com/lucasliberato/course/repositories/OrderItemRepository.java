package br.com.lucasliberato.course.repositories;

import br.com.lucasliberato.course.entities.OrderItem;
import br.com.lucasliberato.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
