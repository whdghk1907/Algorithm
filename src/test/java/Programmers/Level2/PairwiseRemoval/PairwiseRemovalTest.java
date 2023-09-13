package Programmers.Level2.PairwiseRemoval;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairwiseRemovalTest {

    PairwiseRemoval pairwiseRemoval;

    @BeforeEach
    public void setPairwiseRemoval() {
        pairwiseRemoval = new PairwiseRemoval();
    }

    @Test
    public void testPairwiseRemoval() {
        //given
        String given = "baabaa";

        //when
        int result = pairwiseRemoval.pairwiseRemoval(given);

        //then
        assertEquals(result, 1);
    }

}
