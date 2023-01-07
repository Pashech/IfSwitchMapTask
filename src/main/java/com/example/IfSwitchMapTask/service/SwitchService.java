package com.example.IfSwitchMapTask.service;

import com.example.IfSwitchMapTask.model.DeathKnight;
import com.example.IfSwitchMapTask.model.Druid;
import com.example.IfSwitchMapTask.model.Hero;
import com.example.IfSwitchMapTask.model.Hunter;
import com.example.IfSwitchMapTask.model.Mage;
import com.example.IfSwitchMapTask.model.Paladin;
import com.example.IfSwitchMapTask.model.Priest;
import com.example.IfSwitchMapTask.model.Rogue;
import com.example.IfSwitchMapTask.model.Shaman;
import com.example.IfSwitchMapTask.model.Warlock;
import com.example.IfSwitchMapTask.model.Warrior;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Data
@Builder
public class SwitchService {

    private final Mage mage;
    private final Paladin paladin;
    private final Druid druid;
    private final Hunter hunter;
    private final Priest priest;
    private final Rogue rogue;
    private final Shaman shaman;
    private final Warlock warlock;
    private final Warrior warrior;
    private final DeathKnight deathKnight;

    public String spell(Hero hero) {
        String str = null;
        switch (hero.getMyClass()) {
            case "mage":
                str = mage.superAbility();
                break;
            case "paladin":
                str = paladin.superAbility();
                break;
            case "druid":
                str = druid.superAbility();
                break;
            case "hunter":
                str = hunter.superAbility();
                break;
            case "priest":
                str = priest.superAbility();
                break;
            case "rogue":
                str = rogue.superAbility();
                break;
            case "shaman":
                str = shaman.superAbility();
                break;
            case "warlock":
                str = warlock.superAbility();
                break;
            case "warrior":
                str = warrior.superAbility();
                break;
            case "deathKnight":
                str = deathKnight.superAbility();
                break;
        }
        return str;
    }
}
