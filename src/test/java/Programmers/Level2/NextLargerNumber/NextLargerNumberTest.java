package Programmers.Level2.NextLargerNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextLargerNumberTest {

    NextLargerNumber nextLargerNumber;

    @BeforeEach
    public void setNextLargerNumber() {
        nextLargerNumber = new NextLargerNumber();
    }

    @Test
    public void testNextLargerNumber() {
        //given
        int given = 78;

        //when
        int result = nextLargerNumber.nextLargerNumber(given);

        //then
        assertEquals(83, result);
    }
}
