package com.aiwolf.context;

import com.aiwolf.valueobject.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("基本玩法")
public class GameDemo {

    // define the persons in the game
    private List<Person> persons = new ArrayList<Person>();
    // define the stages in the game
    public static final int THE_DAY = 1;
    public static final int THE_NIGHT = 2;
    private int currentStage = THE_NIGHT;

    @BeforeEach
    void setUp() {
        // add wolf
        int i = 1;
        persons.add(new God(PersonId.of(i++)));
        persons.add(new Prophet(PersonId.of(i++)));
        persons.add(new Witch(PersonId.of(i++)));
//        persons.add(new Hunter(PersonId.of(i++)));
        persons.add(new Wolf(PersonId.of(i++)));
        persons.add(new Wolf(PersonId.of(i++)));
//        persons.add(new Wolf(PersonId.of(i++)));
        persons.add(new Commoner(PersonId.of(i++)));
        persons.add(new Commoner(PersonId.of(i++)));
//        persons.add(new Commoner(PersonId.of(i++)));
    }

    @Test
    public void should_start() {


        assertEquals(1, 1);
    }
}
