package WK1;

import java.util.Scanner;

public class Pyramid {

    public static void printpyramid (int lines) {
        for (int i = 1; i <= lines; i ++) {

            for(int k = i; k <= lines; k++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            // Print the number
            for (int j = -i; j <= i; j ++) {
                if (j == 0 || j == 1) {
                    continue;
                }
                System.out.print(Math.abs(j) + " " );
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int lines = input.nextInt();
        printpyramid(lines);
    }
}
