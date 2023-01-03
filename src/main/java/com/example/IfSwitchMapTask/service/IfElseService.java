package com.example.IfSwitchMapTask.service;

import com.example.IfSwitchMapTask.model.Hero;
import com.example.IfSwitchMapTask.model.Mage;
import com.example.IfSwitchMapTask.model.Paladin;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Data
public class IfElseService {

    private final Mage mage;
    private final Paladin paladin;

    public String spell(Hero hero){
        String str = null;
        if(hero.getClassName().equals("mage")){
            str = mage.superAbility();
        } else if (hero.getClassName().equals("paladin")) {
            str = paladin.superAbility();
        }
        return str;
    }

}
