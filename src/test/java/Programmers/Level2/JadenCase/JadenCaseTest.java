package Programmers.Level2.JadenCase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JadenCaseTest {

    JadenCase jadenCase;

    @BeforeEach
    void setJadenCase() {
        jadenCase = new JadenCase();
    }

    @Test
    void toJadenTest() {
        //given
        String givenWord = "f3o3r 3th3e lAs3t WeEk";

        //when
        String result = jadenCase.toJaden(givenWord);

        //result
        assertEquals("F3o3r 3th3e Las3t Week", result);
    }
}
