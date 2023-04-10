package com.example.demo.object;

import lombok.*;

@Getter
public class Position {
    public static final String DEFAULT = "시냇가";
    public static final String GARDEN = "정원";
    private String position;

    public Position() {
        this.position = Position.DEFAULT;
    }

    public Position(String position) {
        this.position = position;
    }

    public void setGardenPosition(){
        this.position = GARDEN;
    }

}
