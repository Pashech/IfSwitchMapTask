package com.example.IfSwitchMapTask.model;

import com.example.IfSwitchMapTask.interfaces.Ability;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class Hero implements Ability {

    private String myClass;

    @Override
    public String superAbility() {
        return "";
    }

    public String myType(){
        return "default";
    }
}
