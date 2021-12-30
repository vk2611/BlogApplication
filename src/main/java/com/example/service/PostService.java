package com.example.service;

import java.util.List;

import com.example.model.Post;

public interface PostService {

	public List<Post> getAllPost();

	public void createPost(Post post);

	public Post getById(Long id);

}
