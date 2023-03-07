package com.courzelo.courzelo_core.CourzeloCore.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import com.courzelo.courzelo_core.CourzeloCore.entity.Comment;
import com.courzelo.courzelo_core.CourzeloCore.entity.Post;
import com.courzelo.courzelo_core.CourzeloCore.auth.entity.User;
import com.courzelo.courzelo_core.CourzeloCore.repository.CommentRepository;
import com.courzelo.courzelo_core.CourzeloCore.repository.PostRepository;
import com.courzelo.courzelo_core.CourzeloCore.auth.service.SequenceGeneratorService;

@Service
public class CommentService {
	
	@Autowired
	CommentRepository commentRepository;
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;
	
	@Autowired
	RestTemplateBuilder restTemplateBuilder;
	private static final String GET_USER_BY_ID_API = "http://localhost:8082/api/auth/getUser/{id}";
	
	public User getUserByRestTemplate(long id){
		Map<String, Long> param = new HashMap<>();
		param.put("id", id);
		User user = restTemplateBuilder.build().getForObject(GET_USER_BY_ID_API, User.class, param);
		return user;
	}
	
	public Comment addComment(Comment comment, long idUser, long idPost){
		User user = getUserByRestTemplate(idUser);
		comment.setIdComment(sequenceGeneratorService.generateSequence(Comment.SEQUENCE_NAME));

		comment.setUser(user);

		comment.setIdUser(user.getId());

		comment.setIdPost(idPost);
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		comment.setDate(date);
		return commentRepository.save(comment);
	}
	
	public List<Comment> getCommentByPost(long idPost){
		return commentRepository.findCommentByIdPost(idPost);
	}
	
	public void deleteComment(long idComment){
		commentRepository.deleteById(idComment);
	}
	
	public Comment getCommentById(long idComment){
		Comment comment = commentRepository.findById(idComment).get();
		return comment;
	}
	
	public Comment updateComment(long idComment, String commentdetails){
		Comment comment = commentRepository.findById(idComment).get();
		comment.setCommentaire(commentdetails);
		return commentRepository.save(comment);
	}
}
