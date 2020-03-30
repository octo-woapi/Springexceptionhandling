package com.example.pocexc.infra;

import com.example.pocexc.domain.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @Autowired
    CartService service;

    @PostMapping(value = "/cart/{cartId}/products", produces = {MediaType.APPLICATION_JSON_VALUE})
    Cart addItem(@RequestBody ProductAndQuantityJson productAndQuantityJson, @PathVariable String cartId){
        return service.addItemToCart(cartId, productAndQuantityJson.getProductId(), productAndQuantityJson.getQuantity());
    }
}








class ProductAndQuantityJson{
    int quantity;
    String productId;

    public ProductAndQuantityJson() {
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
}
