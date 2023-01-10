package com.example.springboot_example.repositories;


import com.example.springboot_example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
