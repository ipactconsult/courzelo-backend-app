package com.courzelo.courzelo_core.CourzeloCore.iserviceRest;

import com.courzelo.courzelo_core.CourzeloCore.dto.*;
import com.courzelo.courzelo_core.CourzeloCore.entity.*;

public interface IServiceReaction {
	public ReactionDTO addreaction(long idUser, long idPost, String rt);
	public ReactionDTO updateReaction(long idReaction, String rt); 
	public void deleteReaction(long idReaction); 
	public int getReactionByIdPostAndIdUser(long idUser, long idPost); 
	public int countReactionsByPostAndType(long idPost ,String reactionType); 
	public Reaction getReactionToUpdate(long idUser, long idPost);

}
