package com.courzelo.app.serviceRest;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.courzelo.app.iserviceRest.IServiceComment;
import com.courzelo.app.dto.CommentDTO;
import com.courzelo.app.entity.Comment;
import com.courzelo.app.entity.Post;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courzelo.app.dto.*;
import com.courzelo.app.entity.*;

import com.courzelo.app.auth.service.SequenceGeneratorService;
import com.courzelo.app.repository.CommentRepository;
import com.courzelo.app.repository.PostRepository;







@Service

public class CommentBusinesses implements IServiceComment {

      
      @Autowired
      private CommentRepository commentRepository;
          @Autowired
          private ModelMapper mapper;
          @Autowired
          private  SequenceGeneratorService sequenceGeneratorService;
          
          @Autowired
          PostRepository postRepository ;
		
		@Override
		public List <CommentDTO> getList() {
			List<Comment> comments = commentRepository.findAll();
			return comments.stream().map(comment -> mapper.map(comment, CommentDTO.class))
					.collect(Collectors.toList());
			
		}
		
		@Override
		public CommentDTO getCommentById(long idComment) {
			Comment comment=commentRepository.findByIdComment(idComment);
			return mapper.map(comment, CommentDTO.class);
			
		}
		
		
		
		
		
		
		
		
		
		
		@Override
		public CommentDTO updateComment(long idComment, CommentDTO requestComment) {
			Comment comment = mapper.map(requestComment, Comment.class);
			Comment comment2=commentRepository.findByIdComment(idComment);
				
			comment.setIdComment(idComment);
		         comment.setIdPost(comment2.getIdPost());
		         comment.setIdUser(comment2.getIdUser());
		         comment.setDate(comment2.getDate());
		         Comment newComment = commentRepository.save(comment);
		         return mapper.map(newComment, CommentDTO.class);
						
				
		}
		@Override
		public void deleteComment(long idComment) {
			Comment comment=commentRepository.findByIdComment(idComment);
			commentRepository.delete(comment);
			
			
		}
		@Override
		public CommentDTO addcomment(CommentDTO f, long idcreateur, long idComment) {
			Comment comment = mapper.map(f, Comment.class);
			comment.setIdComment(sequenceGeneratorService.generateSequence(Comment.SEQUENCE_NAME));
				
			comment.setIdUser(idcreateur);
			comment.setIdPost(idComment);
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(new Date());
			comment.setDate(date);
			
			Comment newComment=commentRepository.save(comment);
				return mapper.map(newComment, CommentDTO.class);
			
		}

		@Override
		public List<CommentDTO> getCommentByIdPost(long id) {
			List<Comment> comments =commentRepository.findByIdPost(id);
			return comments.stream().map(comment -> mapper.map(comment, CommentDTO.class))
					.collect(Collectors.toList());
		}

		@Override
		public int countCommentsByUserIdAndFormationId(long idUser, long idFormation) {

			List<Post> postList = postRepository.findByIdformation(idFormation);
			int nbr = 0 ;
			for(Post post :postList)
			{
				nbr= nbr +  commentRepository.countByIdPostAndIdUser(post.getIdPost(),idUser );
			}
			
			return nbr;
		}
		
	
		


}
