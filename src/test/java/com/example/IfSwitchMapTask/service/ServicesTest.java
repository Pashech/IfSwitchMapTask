package com.example.IfSwitchMapTask.service;

import com.example.IfSwitchMapTask.model.Druid;
import com.example.IfSwitchMapTask.model.Hero;
import com.example.IfSwitchMapTask.model.Mage;
import com.example.IfSwitchMapTask.model.Paladin;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


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
        druid = new Druid("druid");
        mage = new Mage("mage");
        paladin = new Paladin("paladin");

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
        assertEquals("Berserk", testSubjectIfElse.spell(druid));
        assertEquals("Living bomb", testSubjectIfElse.spell(mage));
        assertEquals("Divine Storm", testSubjectIfElse.spell(paladin));
    }

    @Test
    void spellSwitch() {
        assertEquals("Berserk", testSubjectSwitch.spell(druid));
        assertEquals("Living bomb", testSubjectSwitch.spell(mage));
        assertEquals("Divine Storm", testSubjectSwitch.spell(paladin));
    }

    @Test
    void spellMap() {
        assertEquals("Berserk", testSubjectMap.spellMap(druid));
        assertEquals("Living bomb", testSubjectMap.spellMap(mage));
        assertEquals("Divine Storm", testSubjectMap.spellMap(paladin));
    }

    @ParameterizedTest
    @MethodSource("data")
    void spellParamTest(Hero hero, String spellExpected){
        assertEquals(spellExpected, testSubjectIfElse.spell(hero));
        assertEquals(spellExpected, testSubjectSwitch.spell(hero));
        assertEquals(spellExpected, testSubjectMap.spellMap(hero));
    }

    private static Stream<Arguments> data(){
        return Stream.of(
                Arguments.of(new Druid("druid"), "Berserk"),
                Arguments.of(new Mage("mage"), "Living bomb"),
                Arguments.of(new Druid("paladin"), "Divine Storm")
        );
    }
}