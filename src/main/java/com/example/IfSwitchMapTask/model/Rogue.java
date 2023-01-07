package com.example.IfSwitchMapTask.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component
public class Rogue extends Hero {

    @Override
    public String superAbility() {
        return "Shadow dance";
    }

    @Override
    public String myType() {
        return "rogue";
    }
}
