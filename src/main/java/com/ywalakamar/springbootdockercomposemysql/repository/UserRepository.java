package com.ywalakamar.springbootdockercomposemysql.repository;

import com.ywalakamar.springbootdockercomposemysql.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
