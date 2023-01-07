package com.example.IfSwitchMapTask.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component
public class Priest extends Hero{

    @Override
    public String superAbility() {
        return "Merging with darkness";
    }

    @Override
    public String myType() {
        return "priest";
    }
}
