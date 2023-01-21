package com.example.IfSwitchMapTask.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class Druid extends Hero{

    public Druid(String myClass) {
        super(myClass);
    }

    @Override
    public String superAbility() {
        return "Berserk";
    }

    @Override
    public String myType() {
        return "druid";
    }
}
