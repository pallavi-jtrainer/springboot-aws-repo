package com.sample.posts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.posts.entity.Posts;
import com.sample.posts.repository.PostsRepository;

@Service
public class PostsService {
	@Autowired
	private PostsRepository repo;
	
	public List<Posts> listAllPosts() {
		return repo.findAll();
	}
	
	public Optional<Posts> getPostDetails(int id) {
		return repo.findById(id);
	}
	
	public List<Posts> getAllByUserId(int id) {
		return repo.findAllByUserId(id);
	}
	
	public Posts savePost(Posts post) {
		return repo.save(post);
	}
}
