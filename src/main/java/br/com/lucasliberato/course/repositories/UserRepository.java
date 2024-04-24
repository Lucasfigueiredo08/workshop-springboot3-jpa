package br.com.lucasliberato.course.repositories;

import br.com.lucasliberato.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
