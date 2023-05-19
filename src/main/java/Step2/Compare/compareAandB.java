package Step2.Compare;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class compareAandB {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bufferedReader.readLine().split(" ");

        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);

        if(a > b) {
            System.out.println(">");
        }

        if(a < b) {
            System.out.println("<");
        }

        if(a == b) {
            System.out.println("==");
        }
    }
}
