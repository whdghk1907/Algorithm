package Step2.Oven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oven {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] lines = bufferedReader.readLine().split(" ");
        String nextLine = bufferedReader.readLine();

        int[] nowTime = parseIntArray(lines);
        int cookingTime = parseInt(nextLine);

        String cookedTime = cook(nowTime, cookingTime);
        System.out.println(cookedTime);
    }
    public static String cook(int[] times, int cookingTime) {
        int hour = times[0];
        int minute = times[1] + cookingTime;

        while (minute > 59) {
            minute = minute - 60;
            hour++;
        }

        while (hour > 23) {
            hour = hour - 24;
        }

        return hour + " " + minute;
    }

    public static int[] parseIntArray(String[] strings) {
        int[] integers = new int[strings.length];

        for(int i = 0; i < strings.length; i++){
            integers[i] = parseInt(strings[i]);
        }

        return integers;
    }

    public static int parseInt(String strings) {
        return Integer.parseInt(strings);
    }
}
