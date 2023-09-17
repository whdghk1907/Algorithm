package Programmers.Level2.Capet;

import Programmers.Level2.Capet.Capet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CapetTest {

    Capet capet;

    @BeforeEach
    public void setCapet() {
        capet = new Capet();
    }

    @Test
    public void CapetTest() {
        //given
        int brown = 10;
        int yellow = 2;

        //when
        int[] result = capet.capet(brown, yellow);

        //then
        assertArrayEquals(new int[]{4,3}, result);
    }
}
