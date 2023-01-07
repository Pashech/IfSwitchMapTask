package com.example.IfSwitchMapTask.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component
public class Warrior extends Hero {

    @Override
    public String superAbility() {
        return "Bladestorm";
    }

    @Override
    public String myType() {
        return "warrior";
    }
}
