package Programmers.Level2.MinimumValues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumValuesTest {

    MinimumValues minimumValues;

    @BeforeEach
    public void setMinimumValues() {
        minimumValues = new MinimumValues();
    }

    @Test
    public void decreasingArray() {
        //given
        int[] arr = new int[]{9,3,1};

        //when
        int[] result =  minimumValues.descendingArray(arr);

        //then
        assertArrayEquals(new int[]{1,3,9} , result);
    }
}
