package com.aucasa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aucasa.entity.Post;



public interface PostRepository extends JpaRepository<Post, Long>{

}
