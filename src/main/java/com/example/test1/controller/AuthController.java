package com.example.test1.controller;

import com.example.test1.model.Auth;
import com.example.test1.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthController {
    @Autowired
    IAuthService authService;

    @GetMapping
    public ResponseEntity<?> getList(){
        Iterable<Auth> listAuth = authService.findAll();
        return new ResponseEntity<>(listAuth, HttpStatus.OK);
    }


}
