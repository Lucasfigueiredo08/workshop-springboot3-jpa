package br.com.lucasliberato.course.services;

import br.com.lucasliberato.course.entities.Order;
import br.com.lucasliberato.course.entities.User;
import br.com.lucasliberato.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order  = orderRepository.findById(id);
        return order.get();
    }
}
