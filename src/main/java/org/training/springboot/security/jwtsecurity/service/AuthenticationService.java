package org.training.springboot.security.jwtsecurity.service;

import org.training.springboot.security.jwtsecurity.payload.request.AuthenticationRequest;
import org.training.springboot.security.jwtsecurity.payload.request.RegisterRequest;
import org.training.springboot.security.jwtsecurity.payload.response.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
}
