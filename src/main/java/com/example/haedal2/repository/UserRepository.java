package com.example.haedal2.repository;

import com.example.haedal2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Boolean existsByUsername(String username);
}
