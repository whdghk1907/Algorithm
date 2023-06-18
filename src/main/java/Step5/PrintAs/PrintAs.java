package Step5.PrintAs;

import java.util.Scanner;

public class PrintAs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(input);
        }


    }
}
