package com.example.IfSwitchMapTask.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component
public class Shaman extends Hero {

    @Override
    public String superAbility() {
        return "Thunder and lightning";
    }

    @Override
    public String myType() {
        return "shaman";
    }
}
