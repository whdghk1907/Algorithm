package Programmers.Level2.RepeatingBinaryConversion;

public class RepeatingBinaryConversion {

    public int[] solution(String s) {
        int countConversion = 0;
        int countZero = 0;

        while (!s.equals("1")) {
            countConversion++;
            String temp = s.replaceAll("0", "");
            int len = temp.length();
            countZero += s.length() - len;
            s = Integer.toBinaryString(len);
        }

        return new int[]{countConversion, countZero};
    }
}
