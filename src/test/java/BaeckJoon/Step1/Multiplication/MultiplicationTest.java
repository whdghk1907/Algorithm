package BaeckJoon.Step1.Multiplication;

import BaeckJoon.Step1.Multiplication.Multiplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    Multiplication multipleication;
    @BeforeEach
    void setMain() {
        multipleication = new Multiplication();
    };

    @Test
    void multiply() {
        // given
        int toMultiple = 123;
        int byMultiple = 456;

        // when
        int result = multipleication.multiply(toMultiple, byMultiple);

        // then
        assertEquals(56088, result);
    }

    @Test
    void integerToArray() {
        //given
        int integer = 123;

        //when
        int[] result = multipleication.integerToArray(integer);

        //then
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }
}
