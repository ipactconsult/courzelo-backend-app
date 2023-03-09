package com.courzelo.app.iserviceRest;

import java.util.List;

import com.courzelo.app.dto.*;
import com.courzelo.app.entity.*;
import com.courzelo.app.dto.PostDTO;


public interface IServicePost {
	public PostDTO addpost(PostDTO f, long idcreateur , long idFormation);
	public List<PostDTO>getList();
	public List<PostDTO>getPostByIdFormation(long id);
	public PostDTO getPostById(long idPost); 
	public PostDTO updatePost(long idPost ,PostDTO requestPost); 
	public void deletePost(long idPost); 
    public List<PostDTO> getAllPostPrivate(Boolean statprivate,long idFormation);
    public PostDTO updatePostpublic(long idPost ,Boolean statprivate); 
}
