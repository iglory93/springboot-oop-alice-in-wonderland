package com.example.demo.object;

import lombok.*;

@Getter
public class Door {
    public static final Integer LIMIT_DOOR_HEIGHT = 190;
    private Alice.Height height;

    private Position position;

    public Door(Alice.Height height, Position position) {
        this.height = height;
        this.position = position;
    }

    public Boolean throughDoor(Integer height){
        return this.validateDoorHeight(height);
    }

    private Boolean validateDoorHeight(Integer height){
        if ( this.LIMIT_DOOR_HEIGHT > height ) {
            position.setGardenPosition();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
