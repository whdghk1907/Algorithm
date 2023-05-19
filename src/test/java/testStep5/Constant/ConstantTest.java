package testStep5.Constant;

import Step5.Constant.Constant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstantTest {

    Constant constant;
    @BeforeEach
    public void setConstant() {
        constant = new Constant();
    }

    @Test
    public void flipNumeric() {
        //given
        int[] a = new int[]{4,8,7};

        //when
        int result = constant.flipNumeric(a);

        //then
        assertEquals(result, 487);
    }

    @Test
    public void flipAndConvertToArray() {
        //given
        int a = 487;

        //when
        int[] results = constant.flipAndConvertToArray(a);

        //then
        assertArrayEquals(results, new int[]{7,8,4});
    }
}
