package br.com.lucasliberato.course.resources;

import br.com.lucasliberato.course.entities.Order;
import br.com.lucasliberato.course.entities.User;
import br.com.lucasliberato.course.services.OrderService;
import br.com.lucasliberato.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService userService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }
}