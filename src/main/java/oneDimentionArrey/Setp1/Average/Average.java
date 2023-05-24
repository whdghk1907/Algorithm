package oneDimentionArrey.Setp1.Average;

import java.io.BufferedReader;
import java.util.Arrays;

public class Average {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        int numberCount = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");

        double arrayInt[] = new double[numberCount];

        double max = 0;
        double sum = 0;

        for(int i = 0; i < numberCount; i++){
            arrayInt[i] = Integer.parseInt(arr[i]);

            if(arrayInt[i]> max) {
                max=arrayInt[i];
            }
        }

        for(int i = 0; i < numberCount; i++){
            sum += arrayInt[i] / max * 100;
        }

        System.out.println(sum / numberCount);
    }
}
