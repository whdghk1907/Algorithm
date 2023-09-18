package Programmers.Level3.IntegerTriangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerTrianlgeTest {
    IntegerTriangle integerTriangle;

    @BeforeEach
    public void setIntegerTriangle() {
        integerTriangle = new IntegerTriangle();
    }

    @Test
    public void testIntegerTriangle() {
        //given
        int[][] triangle = new int[][]{
                {7},
                {3, 8},
                {8, 1, 0},
                {2, 7, 4, 4},
                {4, 5, 2, 6, 5}
        };

        //when
        int result = integerTriangle.integerTriangle(triangle);

        //then
        assertEquals(30, result);
    }
}
