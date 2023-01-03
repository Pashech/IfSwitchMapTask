package com.example.IfSwitchMapTask.service;

import com.example.IfSwitchMapTask.model.Hero;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Data
@RequiredArgsConstructor
public class MapService {

    private final Map<String, Hero> map;

    public String spellMap(Hero hero) {
        Hero hero1 = map.getOrDefault(hero.getClassName(), new Hero());
        return hero1.superAbility();
    }
}
