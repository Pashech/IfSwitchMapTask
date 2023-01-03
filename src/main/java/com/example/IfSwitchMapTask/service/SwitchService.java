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
public class SwitchService {

    private final Mage mage;
    private final Paladin paladin;

    public void spell(Hero hero) {
        switch (hero.getClassName()) {
            case "mage":
                System.out.println(mage.superAbility());
            break;
            case "paladin":
                System.out.println(paladin.superAbility());
            break;
        }
    }
}
