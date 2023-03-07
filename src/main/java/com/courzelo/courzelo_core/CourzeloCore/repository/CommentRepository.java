package com.courzelo.courzelo_core.CourzeloCore.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.entity.Comment;

@Repository
public interface CommentRepository extends MongoRepository<Comment, Long>{
	
	public List<Comment> findCommentByIdPost(long idPost);
		public List<Comment> findByIdPost(long idPost);
	public Comment findByIdComment(long idComment);
	
	public int countByIdPostAndIdUser(long idPost, long idUser);




}
