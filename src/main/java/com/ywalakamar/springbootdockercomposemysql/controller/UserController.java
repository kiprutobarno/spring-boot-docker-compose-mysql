package com.ywalakamar.springbootdockercomposemysql.controller;

import com.ywalakamar.springbootdockercomposemysql.model.User;
import com.ywalakamar.springbootdockercomposemysql.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/")
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(service.fetchAll());
    }

    @PostMapping("/")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return new ResponseEntity<>(service.create(user), HttpStatus.CREATED);
    }

}
