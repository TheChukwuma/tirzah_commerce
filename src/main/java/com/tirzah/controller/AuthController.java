package com.tirzah.controller;

import com.tirzah.model.User;
import com.tirzah.pojo.GenericResponse;
import com.tirzah.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    @GetMapping("/register")
    public GenericResponse register() {
        return authService.registerUser(new User());
    }
}
