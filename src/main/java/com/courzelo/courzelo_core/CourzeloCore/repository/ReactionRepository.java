
package com.courzelo.courzelo_core.CourzeloCore.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.courzelo_core.CourzeloCore.entity.Reaction;


@Repository
public interface ReactionRepository extends MongoRepository<Reaction, Integer>{

	
	public List<Reaction> findByIdPostAndIduser(long idPost,long idUser);
	public Reaction findByIdReaction(long idReaction);
	public List<Reaction> findByIdPostAndReactionType(long idPost,String reactionType);
	
}
