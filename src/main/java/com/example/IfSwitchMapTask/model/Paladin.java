package com.example.IfSwitchMapTask.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component
public class Paladin extends Hero{

    @Override
    public String superAbility() {
        return "Divine Storm";
    }

    @Override
    public String myType() {
        return "paladin";
    }
}
