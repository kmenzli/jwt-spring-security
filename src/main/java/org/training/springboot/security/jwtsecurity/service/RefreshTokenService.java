package org.training.springboot.security.jwtsecurity.service;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseCookie;
import org.training.springboot.security.jwtsecurity.entities.RefreshToken;
import org.training.springboot.security.jwtsecurity.payload.request.RefreshTokenRequest;
import org.training.springboot.security.jwtsecurity.payload.response.RefreshTokenResponse;

import java.util.Optional;

public interface RefreshTokenService {

    RefreshToken createRefreshToken(Long userId);
    RefreshToken verifyExpiration(RefreshToken token);
    Optional<RefreshToken> findByToken(String token);
    RefreshTokenResponse generateNewToken(RefreshTokenRequest request);
    ResponseCookie generateRefreshTokenCookie(String token);
    String getRefreshTokenFromCookies(HttpServletRequest request);
    void deleteByToken(String token);
    ResponseCookie getCleanRefreshTokenCookie();
}
