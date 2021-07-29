package WK5.Conversion;

import java.util.Scanner;

public class bin2dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String decimal = input.nextLine();
        try {
            System.out.println(Integer.parseInt(decimal, 2));
        } catch (
                NumberFormatException e) {
            System.out.println("Error !!! ");
        }
    }
}
