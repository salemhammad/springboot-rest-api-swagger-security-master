package com.example.salemwebser.repository;

import com.example.salemwebser.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    Optional<Post> findByDescriptionAndTitle(String description, String title);
}
