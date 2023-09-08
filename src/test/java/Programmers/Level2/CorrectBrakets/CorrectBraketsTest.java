package Programmers.Level2.CorrectBrakets;

import Programmers.Level2.CorrectBrackets.CorrectBrakets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorrectBraketsTest {

    CorrectBrakets correctBrakets;

    @BeforeEach
    public void setUp() {
        correctBrakets = new CorrectBrakets();
    }


    @Test
    public void testCorrectBrakets() {
        //given
        String answer = "())";

        //when
        boolean isCorrectBrakets = correctBrakets.isCorrectBrackets(answer);

        //then
        assertFalse(isCorrectBrakets);
    }
}
