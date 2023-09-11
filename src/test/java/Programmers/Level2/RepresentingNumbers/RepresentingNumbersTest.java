package Programmers.Level2.RepresentingNumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepresentingNumbersTest {

    RepresentingNumbers representingNumbers;

    @BeforeEach
    public void setRepresentingNumbers() {
        representingNumbers = new RepresentingNumbers();
    }


    @Test
    public void testRepresentingNumbers() {
        //given
        int givenNumber = 15;

        //when
        int result = representingNumbers.representingNumbers(givenNumber);

        //then
        assertEquals(4, result);
    }
}
