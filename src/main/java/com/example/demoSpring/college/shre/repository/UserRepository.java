package com.example.demoSpring.college.shre.repository;

import com.example.demoSpring.college.shre.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Additional query methods can be defined here if needed


}