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
    public void minimun(){
        //given
        int[] A = {4,1,2};
        int[] B = {4,5,4};

        //when
        int result = minimumValues.minimun(A, B);

        //then
        assertEquals(29, result);
    }
}
