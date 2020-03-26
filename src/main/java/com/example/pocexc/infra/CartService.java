package com.example.pocexc.infra;

import com.example.pocexc.domain.Cart;
import com.example.pocexc.exceptions.CartNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CartService {

    private Map<String ,Cart> carts = new HashMap<>();

    @PostConstruct
    void init(){
        Cart cart = Cart.generateCart(); carts.put(cart.getId(), cart);
    }


    public Cart addItemToCart(String cartId, String productId,int quantity){
        Cart cart = carts.get(cartId);
        if(cart == null) throw new CartNotFoundException(cartId);
        cart.getProductsQuantityMap().put(productId, quantity);
        return cart;
    }
}
