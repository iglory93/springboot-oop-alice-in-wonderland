package com.example.demo.object;

import lombok.*;

@Getter
public class Mushroom {

    public static final Integer DEFAULT = 50;

    private Integer quantity;

    public Mushroom() {
        this.quantity = DEFAULT;
    }

    public void reduceMushroom(Integer quantity) {
        this.quantity -= quantity;
    }
}
