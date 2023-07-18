package Step7.Confetti;

import java.util.Scanner;

public class Confetti {
    static int[][] drawingPaper = new int[100][100];
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int confettiCount =  scanner.nextInt();
        int area = 0;

        for (int i = 0; i < confettiCount; i++) {

              int x = scanner.nextInt();
              int y = scanner.nextInt();

              makeConfetti(x, y);
        }
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
               if(drawingPaper[i][j] == 1) {
                   area ++;
               }
            }

        }
        System.out.println(area);

    }

    public static int makeConfetti(int x, int y) {

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                drawingPaper[x + i][y + j] = 1;
            }
        }


        return 0;
    }
}
