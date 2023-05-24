package oneDimentionArrey.Setp1.Average;

import java.io.BufferedReader;
import java.util.Arrays;

public class Average {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        System.out.println(arr);
        double arrayInt[] = new double[N];
        double max = 0;
        double sum = 0;

        for(int i=0; i<N; i++){
            arrayInt[i] = Integer.parseInt(arr[i]);
            if(arrayInt[i]> max) {
                max=arrayInt[i];
            }
        }

        System.out.println(max);



    }



}
