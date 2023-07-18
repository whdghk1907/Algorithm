package testStep2.Oven;

import Step2.Oven.Oven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OvenTest {

    Oven oven;

    @BeforeEach
    void setOven() {
        oven = new Oven();
    }

    @Test
    void testOven() {
        //given
        int[] nowTime = new int[]{14, 30};
        int cookingTime = 30;

        //when
        String afterCookingTime = oven.cook(nowTime, cookingTime);

        //then
        assertEquals(afterCookingTime, "15 0");
    }

    @Test
    void parseInt() {
        //given
        String string = "14";

        //when
        int numbers = oven.parseInt(string);

        //then
        assertEquals(numbers, 14);
    }

    @Test
    void parseIntArray() {
        //given
        String[] strings = new String[]{"14", "30"};

        //when
        int[] numbers = oven.parseIntArray(strings);

        //then
        assertArrayEquals(numbers, new int[]{14, 30});
    }
}
