package com.example.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.model.Post;
import com.example.model.User;
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
	public String createPost(Post post) {
		post.setPostCreated(new Date());
		postRepository.save(post);
		return "created Successfully";

	}

	@Override
	public Post getById(Long id) {
		return postRepository.findById((long) id).orElse(null);
	}

	@Override
	public List<Post> findByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePost(Long id) {
		Post post = getById(id);
		if (!ObjectUtils.isEmpty(post)) {
			postRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
