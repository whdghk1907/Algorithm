package testStep2.ThreeDice;

import Step2.ThreeDice.ThreeDice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeDiceTest {
    ThreeDice threeDice;

    @BeforeEach
    void setUp() {
        threeDice = new ThreeDice();
    }

    @Test
    void threeGoalsTest() {
        //given
        int diceValue = 2;

        //when
        int result = threeDice.threeGoals(diceValue);

        //then
        assertEquals(12000, result);
    }

    @Test
    void twoGoalsTest() {
        //given
        int diceValue1 = 3;
        int diceValue2 = 3;
        int diceValue3 = 6;

        //when
        int result = threeDice.twoGoals(diceValue1, diceValue2, diceValue3);

        //then
        assertEquals(1300, result);
    }

    @Test
    void noGoalsTest() {
        //given
        int diceValue1 = 3;
        int diceValue2 = 3;
        int diceValue3 = 6;

        //when
//        int result = threeDice.noGoals(diceValue1, diceValue2, diceValue3);

        //then
//        assertEquals(400, result);
    }
}
