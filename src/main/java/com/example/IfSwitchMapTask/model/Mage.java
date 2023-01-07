package com.example.IfSwitchMapTask.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component
public class Mage extends Hero {

    @Override
    public String superAbility() {
        return "Living bomb";
    }

    @Override
    public String myType() {
        return "mage";
    }
}
