package WK1;

import java.util.Scanner;

public class Ex2 {

    static void checkdiv (int inp) {
        if (inp % 5 == 0 && inp % 6 == 0) {
            System.out.println(inp + " is divisible by both 5 and 6" );
        } else if (inp % 5 == 0 || inp % 6 == 0) {
            System.out.println(inp + " is divisible by 5 or 6 but not both");
        } else {
            System.out.println(inp + " is not divisible by either 5 or 6");
        }
    }
    public static void main(String[] args) {
        //Initialize Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userinput = input.nextInt();
        checkdiv(userinput);
    }
}
