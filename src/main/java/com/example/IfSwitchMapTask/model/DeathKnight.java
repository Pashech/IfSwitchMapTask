package com.example.IfSwitchMapTask.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component
public class DeathKnight extends Hero {

    @Override
    public String superAbility() {
        return "Howling wind";
    }

    @Override
    public String myType() {
        return "deathKnight";
    }
}
