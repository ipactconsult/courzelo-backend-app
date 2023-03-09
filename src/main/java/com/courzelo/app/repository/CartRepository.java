package com.courzelo.app.repository;

import java.util.List;
import java.util.Optional;

import com.courzelo.app.entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courzelo.app.auth.entity.User;

@Repository
public interface CartRepository extends MongoRepository<Cart, Long>{
	
	void deleteCartByIdCart(long idCart);
	
	Optional<Cart> findCartByIdCart(long idCart);
	
	List<Cart> findCartByUser(User user);


}
