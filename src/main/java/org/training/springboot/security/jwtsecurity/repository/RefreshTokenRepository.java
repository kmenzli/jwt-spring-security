package org.training.springboot.security.jwtsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.training.springboot.security.jwtsecurity.entities.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByToken(String token);

}
