package testStep1.Multiplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BukketTest {
    Bukkit bukkit;
    @BeforeEach
    void setMain() {
        bukkit = new Bukket();
    };

    @Test
    void reverseTest() {
        //given
        int start = 1;
        int end = 2;
        int[] arr = new int[]{1,2,3,4,5};

        //when
        int result = bukkit.reverse(arr, start, end);

        //then
        assertEquals(new int[]{2,1,3,4,5}, result);
    }
}
