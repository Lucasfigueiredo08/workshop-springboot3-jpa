package br.com.lucasliberato.course.services;

import br.com.lucasliberato.course.entities.User;
import br.com.lucasliberato.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user  = userRepository.findById(id);
        return user.get();
    }
}
