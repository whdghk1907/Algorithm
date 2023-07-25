package Programmers.Level2.MaxAndMinValues;

import Programmers.Level2.MaxMinValues.MaxAndMinValues;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAndMinValuesTest {
    MaxAndMinValues maxAndMinValues;

    @BeforeEach
    void setMaxAndMinValues() {
        maxAndMinValues = new MaxAndMinValues();
    }

    @Test
    void testMaxAndMinValues() {
        //given
        String s = "1 2 3 4";

        //when
        String answer = maxAndMinValues.MaxAndMinValues(s);

        //then
        assertEquals("1 4", answer);
    }
}
