package com.example.IfSwitchMapTask.service;

import com.example.IfSwitchMapTask.model.Hero;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Service
@Data
public class MapService {

    private Map<String, Hero> map;

    public MapService(List<Hero> heroList){
        map = heroList.stream().collect(toMap(Hero::myType, Function.identity()));
    }

    public String spellMap(Hero hero) {
        Hero newHero = map.getOrDefault(hero.getMyClass(), new Hero());
        return newHero.superAbility();
    }
}
