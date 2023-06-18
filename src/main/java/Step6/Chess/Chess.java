package Step6.Chess;

import java.util.Scanner;

public class Chess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scannValue = scanner.nextLine();
        String [] values = scannValue.split(" ");

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        for(int i = 0; i < values.length; i++) {
            if(i==0){
                king = king - Integer.parseInt(values[i]);
            } else if(i==1){
                queen = queen - Integer.parseInt(values[i]);
            } else if(i==2){
                rook = rook - Integer.parseInt(values[i]);
            } else if(i==3){
                bishop = bishop - Integer.parseInt(values[i]);
            } else if(i==4){
                knight = knight - Integer.parseInt(values[i]);
            } else if(i==5){
                pawn = pawn - Integer.parseInt(values[i]);
            }
        }
        System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
    }
}
