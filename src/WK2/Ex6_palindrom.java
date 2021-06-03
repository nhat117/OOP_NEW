package WK2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex6_palindrom {

    public static String cleanup(String inp) {
        StringBuilder tmp = new StringBuilder();

        for (int i = 0; i < inp.length(); i ++) {
            // Char at i use to access string like an array
            if(Character.isLetterOrDigit(inp.charAt(i))) {
                tmp.append(inp.charAt(i));
            }
        }
        return  tmp.toString();
    }

    public static String rev(String inp) {
        StringBuilder tmp = new StringBuilder(cleanup(inp));
        tmp.reverse();
        return  tmp.toString();
    }

    public static void isPalindrome(String inp) {
        String tmp2 = cleanup(inp);
        String tmp1 = rev(inp);
        // Use is equal ignore case methode
        if (!tmp1.equalsIgnoreCase(tmp2)) {
            System.out.println(" The input string is not palindrome");
            return;
        }
        System.out.println("The input string is a palindrome");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String inp = input.nextLine();
        isPalindrome(inp);
    }
}
