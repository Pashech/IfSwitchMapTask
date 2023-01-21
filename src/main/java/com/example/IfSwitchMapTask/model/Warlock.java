package com.example.IfSwitchMapTask.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component
public class Warlock extends Hero {

    public Warlock(String myClass) {
        super(myClass);
    }

    @Override
    public String superAbility() {
        return "Arrow of chaos";
    }

    @Override
    public String myType() {
        return "warlock";
    }
}
