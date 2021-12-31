package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Post;
import com.example.service.PostService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BlogController {

	@Autowired
	PostService postService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/getAllPost")
	public List<Post> getAllPost() {
		return postService.getAllPost();
	}

	@PostMapping("/createPost")
	public String createPost(@RequestBody Post post) {
		return postService.createPost(post);
	}

}