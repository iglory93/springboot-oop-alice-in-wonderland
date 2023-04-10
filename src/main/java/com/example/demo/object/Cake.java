package com.example.demo.object;

import lombok.*;

@Getter
public class Cake {
    private static final Integer DEFAULT = 50;

    private Integer quantity ;

    public Cake() {
        this.quantity = DEFAULT;
    }

    public void reduceCake(Integer quantity){
        this.quantity -= quantity;
    }
}
