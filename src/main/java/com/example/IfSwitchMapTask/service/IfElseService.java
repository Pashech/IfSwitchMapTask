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
@Data
@RequiredArgsConstructor
@Builder
public class IfElseService {
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
        if (hero.getMyClass().equals("mage")) {
            str = mage.superAbility();
        } else if (hero.getMyClass().equals("paladin")) {
            str = paladin.superAbility();
        } else if (hero.getMyClass().equals("druid")) {
            str = druid.superAbility();
        } else if (hero.getMyClass().equals("hunter")) {
            str = hunter.superAbility();
        } else if (hero.getMyClass().equals("priest")) {
            str = priest.superAbility();
        } else if (hero.getMyClass().equals("rogue")) {
            str = rogue.superAbility();
        } else if (hero.getMyClass().equals("shaman")) {
            str = shaman.superAbility();
        } else if (hero.getMyClass().equals("warlock")) {
            str = warlock.superAbility();
        } else if (hero.getMyClass().equals("warrior")) {
            str = warrior.superAbility();
        } else if (hero.getMyClass().equals("deathKnight")) {
            str = deathKnight.superAbility();
        }
        return str;
    }

}
