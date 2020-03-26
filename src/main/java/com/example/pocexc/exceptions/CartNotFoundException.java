package com.example.pocexc.exceptions;

public class CartNotFoundException extends NotFoundExceptions{
    public CartNotFoundException(String id) {
        super (String.format("Cart %s not found", id));
    }
}
