package com.ywalakamar.springbootdockercomposemysql.services;

import java.util.List;

import com.ywalakamar.springbootdockercomposemysql.model.User;
import com.ywalakamar.springbootdockercomposemysql.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public User create(User user) {
        user = new User(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
        return repo.save(user);
    }

    public List<User> fetchAll() {
        return repo.findAll();
    }
}
