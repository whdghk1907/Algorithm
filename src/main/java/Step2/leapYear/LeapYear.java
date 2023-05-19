package Step2.leapYear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LeapYear {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine());

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println('1');
        } else {
            System.out.println('0');
        }
    }
}
