package com.example.demo.robot;

import com.example.demo.object.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;


@Slf4j
public class AliceRobot {

    @Test
    public void drinkBeverage(){
        Alice alice = new Alice();
        alice.drunken(2);
        Alice.Height height = alice.getHeight();
        alice.drunken(2);
        log.debug("Alice의 키는 : " + String.valueOf(height.getHeight()));
    }


}
