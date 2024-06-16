package com.newton.JWT.security.API.service;

import com.newton.JWT.security.API.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String generateToken(String username) {
        return JwtUtil.generateToken(username);
    }

    public String extractUsername(String token) {
        return JwtUtil.extractUsername(token);
    }
}
