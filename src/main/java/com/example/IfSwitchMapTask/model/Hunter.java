package com.example.IfSwitchMapTask.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component
public class Hunter extends Hero{

    public Hunter(String myClass) {
        super(myClass);
    }

    @Override
    public String superAbility() {
        return "Explosive shot";
    }

    @Override
    public String myType() {
        return "hunter";
    }
}
