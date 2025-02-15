package com.sample.posts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.posts.entity.Posts;
import com.sample.posts.service.PostsService;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/")
public class PostsController {
	@Autowired
	private PostsService service;
	
	@GetMapping
	public String greeting() {
		return "Hello";
	}
	
	@GetMapping("/api/posts")
	public List<Posts> listAll() {
		return service.listAllPosts();
	}
	
	@GetMapping("/api/posts/{id}")
	public List<Posts> listAllbyUserId(@PathVariable int id) {
		return service.getAllByUserId(id);
	}
	
	@GetMapping("/api/posts/post/{id}")
	public Optional<Posts> getPostDetails(@PathVariable int id) {
		return service.getPostDetails(id);
	}
	
	@PostMapping("/api/posts")
	public Posts savePost(@RequestBody Posts post) {
		return service.savePost(post);
	}
}
