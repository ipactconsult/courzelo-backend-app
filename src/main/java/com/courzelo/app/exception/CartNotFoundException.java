package com.courzelo.app.exception;

public class CartNotFoundException extends RuntimeException{
	public CartNotFoundException(String message) {
        super(message);
    }
}
