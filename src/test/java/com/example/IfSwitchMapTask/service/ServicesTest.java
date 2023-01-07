package com.example.IfSwitchMapTask.service;

import com.example.IfSwitchMapTask.model.Druid;
import com.example.IfSwitchMapTask.model.Hero;
import com.example.IfSwitchMapTask.model.Mage;
import com.example.IfSwitchMapTask.model.Paladin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ServicesTest {

    Druid druid;
    Mage mage;
    Paladin paladin;

    List<Hero> heroesList;
    IfElseService testSubjectIfElse;
    SwitchService testSubjectSwitch;
    MapService testSubjectMap;

    @BeforeEach
    public void prepareData() {
        druid = new Druid();
        druid.setMyClass("druid");

        mage = new Mage();
        mage.setMyClass("mage");

        paladin = new Paladin();
        paladin.setMyClass("paladin");

        testSubjectIfElse = IfElseService.builder()
                .druid(druid)
                .mage(mage)
                .paladin(paladin).build();

        testSubjectSwitch = SwitchService.builder()
                .druid(druid)
                .mage(mage)
                .paladin(paladin).build();


        heroesList = Arrays.asList(druid, mage, paladin);
        testSubjectMap = new MapService(heroesList);
    }

    @Test
    void spellIfElse() {
        Assertions.assertEquals("Berserk", testSubjectIfElse.spell(druid));
        Assertions.assertEquals("Living bomb", testSubjectIfElse.spell(mage));
        Assertions.assertEquals("Divine Storm", testSubjectIfElse.spell(paladin));
    }

    @Test
    void spellSwitch() {
        Assertions.assertEquals("Berserk", testSubjectSwitch.spell(druid));
        Assertions.assertEquals("Living bomb", testSubjectSwitch.spell(mage));
        Assertions.assertEquals("Divine Storm", testSubjectSwitch.spell(paladin));
    }

    @Test
    void spellMap() {
        Assertions.assertEquals("Berserk", testSubjectMap.spellMap(druid));
        Assertions.assertEquals("Living bomb", testSubjectMap.spellMap(mage));
        Assertions.assertEquals("Divine Storm", testSubjectMap.spellMap(paladin));
    }
}