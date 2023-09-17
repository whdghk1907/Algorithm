package Programmers.Level2.Capet;

public class Capet {
    public int[] capet(int brown, int yellow) {
        for (int i = 1; i <= yellow; i++) {
            // yellow의 높이 구하기
            int yellowHeight = yellow / i;

            // yellow가 약수 여부 검사
            if (yellow % i == 0) {

                // yellow가 약수인 경우, brown의 갯수 구해보기
                int totalWidth = i * 2 + yellowHeight * 2 + 4;

                // brown의 갯수가 맞다면, 조건에 따른 정답이다.
                if (totalWidth == brown) {

                    // 조건에 맞는 카펫의 가로, 세로 길이
                    return new int[]{ yellowHeight + 2, i + 2 };
                }
            }
        }
        return null;
    }
}