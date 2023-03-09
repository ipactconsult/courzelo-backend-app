package com.courzelo.app.repository;

import java.util.List;

import com.courzelo.app.entity.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, Long>{
	
	public List<Comment> findCommentByIdPost(long idPost);
		public List<Comment> findByIdPost(long idPost);
	public Comment findByIdComment(long idComment);
	
	public int countByIdPostAndIdUser(long idPost, long idUser);




}
