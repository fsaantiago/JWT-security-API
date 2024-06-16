package com.newton.JWT.security.API.controller;

import com.newton.JWT.security.API.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import com.newton.JWT.security.API.model.LoginRequest;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return authService.generateToken(request.getUsername());
    }

    @GetMapping("/username/{token}")
    public String extractUsername(@PathVariable String token) {
        return authService.extractUsername(token);
    }

    @GetMapping("/user")
    public String getUser(Authentication authentication) {
        return "User: " + authentication.getName();
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/admin")
    public String onlyAdmin(Authentication authentication) {
        return "Admin: " + authentication.getName();
    }
}
