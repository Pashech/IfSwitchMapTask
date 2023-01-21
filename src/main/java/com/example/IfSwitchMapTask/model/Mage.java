package com.example.IfSwitchMapTask.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@EqualsAndHashCode(callSuper = true)
@Data
@Component
@RequiredArgsConstructor
public class Mage extends Hero {
    public Mage(String myClass) {
        super(myClass);
    }

    @Override
    public String superAbility() {
        return "Living bomb";
    }

    @Override
    public String myType() {
        return "mage";
    }
}
