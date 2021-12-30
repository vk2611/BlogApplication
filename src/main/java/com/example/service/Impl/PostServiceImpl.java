package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Post;
import com.example.repository.PostRepository;
import com.example.service.PostService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;

	@Override
	public List<Post> getAllPost() {
		return postRepository.findAll();
	}

	@Override
	public void createPost(Post post) {
		postRepository.save(post);

	}

	@Override
	public Post getById(Long id) {
		return postRepository.findById((long) id).orElse(null);
	}

}
