package com.courzelo.app.iserviceRest;


import java.util.List;

import com.courzelo.app.dto.*;
import com.courzelo.app.entity.*;
import com.courzelo.app.dto.CommentDTO;


public interface IServiceComment {
	public CommentDTO addcomment(CommentDTO f, long idcreateur , long idFormation);
	public List<CommentDTO>getList();
	public List<CommentDTO>getCommentByIdPost(long id);
	public CommentDTO getCommentById(long idComment); 
	public CommentDTO updateComment(long idComment ,CommentDTO requestComment); 
	public void deleteComment(long idPost); 
	
	public int countCommentsByUserIdAndFormationId(long idUser ,long idFormation); 

}
