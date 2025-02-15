package com.sample.posts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.posts.entity.Posts;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Integer>{
	public List<Posts> findAllByUserId(int userId);
}
