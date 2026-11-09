package com.example.haedal2.repository;


import com.example.haedal2.domain.Post;
import com.example.haedal2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    Long countByUser(User user);
    List<Post> findByUser(User user);
}