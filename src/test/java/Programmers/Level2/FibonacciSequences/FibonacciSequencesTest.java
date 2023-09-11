package Programmers.Level2.FibonacciSequences;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciSequencesTest {

    FibonacciSequences fibonacciSequences;

    @BeforeEach
    public void setFibonacciSequences() {
        fibonacciSequences = new FibonacciSequences();
    }

    @Test
    public void testFibonacciSequences() {
        //given
        int given = 5;

        //when
        int result = fibonacciSequences.fibonacciSequences(given);

        //then
        assertEquals(5, result);
    }
}
