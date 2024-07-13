package com.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entities.Category;
import com.blog.entities.Post;
import com.blog.entities.User;

public interface PostRepo extends JpaRepository<Post,Integer> {


	List<Post> findByCategory(Category cat);
	List<Post> getByUser(User user);
	
	List<Post> findByTitleContaining(String title);
}
