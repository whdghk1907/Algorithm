package Programmers.Level2.MaxMinValues;

import java.util.StringTokenizer;

public class MaxAndMinValues {
    public String MaxAndMinValues(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");

        int maximum, minimum;
        maximum = minimum = Integer.parseInt(st.nextToken());

        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());

            if(number > maximum)
                maximum = number;

            if(number < minimum)
                minimum = number;
        }

        return minimum + " " + maximum;
    }
}