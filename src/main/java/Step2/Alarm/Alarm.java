package Step2.Alarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alarm {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String time = bufferedReader.readLine();
        String[] timeArr = time.split(" ");

        int hour = Integer.parseInt(timeArr[0]);
        int minute = Integer.parseInt(timeArr[1]);

        if (minute < 45) {
            hour--;
            minute = 60 - (45 - minute);
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        } else {
            System.out.println(hour + " " + (minute - 45));
        }
    }
}
