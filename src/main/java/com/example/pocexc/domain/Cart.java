package com.example.pocexc.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    private String id;
    private Map<String, Integer> productsQuantityMap;
    private BigDecimal amount;

    public Cart(String id, Map<String, Integer> productsQuantityMap, BigDecimal amount) {
        this.id = id;
        this.productsQuantityMap = productsQuantityMap;
        this.amount = amount;
    }

    public Cart() {
    }

    public static Cart generateCart() {
        Map products = new HashMap<>();
        return new Cart("123", products, BigDecimal.ZERO);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Integer> getProductsQuantityMap() {
        return productsQuantityMap;
    }

    public void setProductsQuantityMap(Map<String, Integer> productsQuantityMap) {
        this.productsQuantityMap = productsQuantityMap;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id='" + id + '\'' +
                ", productsMap=" + productsQuantityMap +
                ", amount=" + amount +
                '}';
    }
}
