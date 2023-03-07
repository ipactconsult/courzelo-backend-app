package com.courzelo.courzelo_core.CourzeloCore.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.entity.Post;
import com.courzelo.courzelo_core.CourzeloCore.auth.entity.User;

@Repository
public interface PostRepository extends MongoRepository<Post, Long>{
	
	void deletePostByIdPost(long idPost);
	
	Post findPostByIdPost(long idPost);
	
	List<Post> findPostByUser(User user);

	
	
	public List<Post> findByIdformation(long idFormation);
	public Post findByIdPost(long idPost);
	public List<Post>  findByStateprivateAndIdformation(Boolean statprivate,long idFormation);
	public int countByIduserAndIdformation(long idUser,long idFormation);


}
