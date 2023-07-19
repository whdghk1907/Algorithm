package Step2.ThreeDice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeDice {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] diceValues = bufferedReader.readLine().split(" ");

        int diceVal1 = Integer.parseInt(diceValues[0]);
        int diceVal2 = Integer.parseInt(diceValues[1]);
        int diceVal3 = Integer.parseInt(diceValues[2]);

    }

    public int threeGoals(int diceVal) {
        return 10000 + (diceVal * 1000);
    }

    public int twoGoals(int diceValue1, int diceValue2, int diceValue3) {
        if (diceValue1 == diceValue2) {
            return 1000 + (diceValue1 * 100);
        } else if (diceValue1 == diceValue3) {
            return 1000 + (diceValue1 * 100);
        } else if (diceValue2 == diceValue3) {
            return 1000 + (diceValue2 * 100);
        }
        return 0;
    }
}
