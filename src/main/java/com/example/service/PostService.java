package com.example.service;

import java.util.List;

import com.example.model.Post;
import com.example.model.User;

public interface PostService {

	public List<Post> getAllPost();

	public String createPost(Post post);

	public Post getById(Long id);

	public List<Post> findByUser(User user);

	public boolean deletePost(Long id);

}
