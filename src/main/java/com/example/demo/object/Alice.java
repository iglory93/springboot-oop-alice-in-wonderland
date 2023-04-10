package com.example.demo.object;

import lombok.*;

@Getter
public class Alice {
    private static final Integer BEVERAGE_HEIGHT = 10;
    private static final Integer CAKE_HEIGHT = 15;
    private static final Integer FAN_HEIGHT = 20;

    private Name name;
    private Height height;
    private Position position;
    private Beverage beverage;
    private Cake cake;
    private Fan fan;
    private Mushroom mushroom;
    private Door door;

    public Alice(){
        name = new Name();
        height = new Height();
        position = new Position();
        beverage = new Beverage();
        cake = new Cake();
        fan = new Fan();
        mushroom = new Mushroom();
        door = new Door(height,position);
    }

    public void drunken(Integer quantity){
        this.beverage.reduceBeverage(quantity);
        this.height.plus(quantity*BEVERAGE_HEIGHT);
    }

    public void eatCake(Integer quantity){
        this.cake.reduceCake(quantity);
        this.height.plus(quantity*CAKE_HEIGHT);
    }

    public void useFan(){
        this.fan.useFan();
        this.height.minus(FAN_HEIGHT);
    }

    @Getter
    public static class Name {
        public static final String ALICE = "Alice";
        private String name;

        public Name() {
            this.name = ALICE;
        }
    }

    @Getter
    public static class Height {
        public static final Integer DEFAULT_HEIGHT = 170;
        private Integer height;

        public Height() {
            this.height = DEFAULT_HEIGHT;
        }

        public void plus(Integer number){
            this.height+=number;
        }

        public void minus(Integer number){
            this.height-=number;
        }

    }
}

