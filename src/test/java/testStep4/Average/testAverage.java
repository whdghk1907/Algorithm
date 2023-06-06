package testStep4.Average;

import Step4.Average.Average;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAverage {
    Average average;

    @BeforeEach
    void setAverage(){
        average = new Average();
    }

    @Test
    void getMaxPoint() {
        //given
        String[] points = new String[]{"40","50","60"};

        //when
        double maxPoint = average.getMaxPoint(points);

        //then
        assertEquals(60, maxPoint);
    }

    @Test
    void getSum() throws IOException {
        //given
        String[] points = new String[]{"40","50","60"};

        //when
        double sumPoint = Average.getSumPoint(points);

        assertEquals(250, sumPoint);


    }
}
