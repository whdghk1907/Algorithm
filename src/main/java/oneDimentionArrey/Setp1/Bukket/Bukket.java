package oneDimentionArrey.Setp1.Bukket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bukkit {
    public static void main (String[] args) throws Exception {
        BufferedReader bufferReader = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bufferWriter = new BufferedWriter((new OutputStreamWriter(System.out)));

        StringTokenizer st = new StringTokenizer(bufferReader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a, b;

        // n 에 대한 배열 생성
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            sb.append(i);
        }

//        for(int i = 0; i < m; i++) {
//            st = new StringTokenizer(bufferReader.readLine());
//            a = Integer.parseInt(st.nextToken());
//            b = Integer.parseInt(st.nextToken());
//
//            // 이부분 생각 못했던 부분 찾아보고 앎
//            // 문제에 대한 이해가 정확하게 되지 않음
//            // 설명좀 써줘요 ㅠㅠ
//            sb.replace(a-1, b, new StringBuffer(sb.substring(a-1, b)).reverse().toString());
//        }
//
//        System.out.println(sb);
//
//        char[] charArray = sb.toString().toCharArray();
//
//        for(int i = 0; i < n - 1; i++) {
//            bufferWriter.write(charArray[i] + " ");
//        }
//
//        bufferWriter.write(charArray[n-1] + "\n");
//
//        bufferWriter.close();
//        bufferReader.close();
//
//    }
}
