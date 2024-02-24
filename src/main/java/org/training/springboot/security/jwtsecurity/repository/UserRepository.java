package org.training.springboot.security.jwtsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.training.springboot.security.jwtsecurity.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
