package com.example.demo.object;

import lombok.*;

@Getter
public class Beverage {
    private static final Integer DEFAULT = 50;
    private Integer quantity ;

    public Beverage() {
        this.quantity = DEFAULT;
    }

    public void incrementBeverage(Integer quantity){
        this.quantity += quantity;
    }

    public void reduceBeverage(Integer quantity){
        this.quantity -= quantity;
    }
}
