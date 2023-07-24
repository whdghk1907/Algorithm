package Programmers.Level2.JadenCase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class JadenCaseTest {

    JadenCase jadenCase;

    @BeforeEach
    void setJadenCase() {
        jadenCase = new JadenCase();
    }

    @Test
    void testToJaden() {
        //given
        String givenWord = "unFollowed";

        //when
        String result = jadenCase.toJadenSingle(givenWord);

        //then
        assertEquals("Unfollowed", result);
    }

    @Test
    void testToJadenMultiple() {
        //given
        String givenWord = "for the last week";

        //when
        String result = jadenCase.JadenCase(givenWord);

        //result
        assertEquals("For The Last Week ", result);
    }
}
