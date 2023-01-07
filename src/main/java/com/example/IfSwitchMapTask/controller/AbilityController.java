package com.example.IfSwitchMapTask.controller;

import com.example.IfSwitchMapTask.model.Hero;
import com.example.IfSwitchMapTask.service.IfElseService;
import com.example.IfSwitchMapTask.service.MapService;
import com.example.IfSwitchMapTask.service.SwitchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class AbilityController {

    private final IfElseService ifElseService;
    private final SwitchService switchService;
    private final MapService mapService;

    @PostMapping("/ability")
    public String abilityRequest(@RequestBody Hero hero){
        return ifElseService.spell(hero);
    }

    @PostMapping("/ability/switch")
    public String abilityRequestSwitch(@RequestBody Hero hero){
        return switchService.spell(hero);
    }

    @PostMapping("/ability/map")
    public String abilityRequestMap(@RequestBody Hero hero){
        return mapService.spellMap(hero);
    }
}

