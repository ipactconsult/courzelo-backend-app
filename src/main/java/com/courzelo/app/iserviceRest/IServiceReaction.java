package com.courzelo.app.iserviceRest;

import com.courzelo.app.dto.*;
import com.courzelo.app.entity.*;
import com.courzelo.app.dto.ReactionDTO;
import com.courzelo.app.entity.Reaction;

public interface IServiceReaction {
	public ReactionDTO addreaction(long idUser, long idPost, String rt);
	public ReactionDTO updateReaction(long idReaction, String rt); 
	public void deleteReaction(long idReaction); 
	public int getReactionByIdPostAndIdUser(long idUser, long idPost); 
	public int countReactionsByPostAndType(long idPost ,String reactionType); 
	public Reaction getReactionToUpdate(long idUser, long idPost);

}
