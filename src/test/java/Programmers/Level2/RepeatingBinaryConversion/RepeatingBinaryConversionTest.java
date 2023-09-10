package Programmers.Level2.RepeatingBinaryConversion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatingBinaryConversionTest {

    RepeatingBinaryConversion repeatingBinaryConversion;

    @BeforeEach
    public void setRepeatingBinaryConversion() {
        repeatingBinaryConversion = new RepeatingBinaryConversion();
    }

    @Test
    public void testSolution() {
        //given
        String givenBinary = "01110";

        //when
        int[] result = repeatingBinaryConversion.solution(givenBinary);

        //then
        assertArrayEquals(new int[]{3,3}, result);
    }
}
