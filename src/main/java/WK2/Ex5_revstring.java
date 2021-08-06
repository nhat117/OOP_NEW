package WK2;

import java.util.Scanner;

public class Ex5_revstring {
    public static void reverse(char [] inp) {
        int left, right = inp.length -1;
        for (left = 0; left < right; left ++ , right --) {
            char tmp = inp [left];
            inp[left] = inp [right];
            inp[right] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String inp = input.nextLine();
        //Convert string to char array
        char [] ch = inp.toCharArray();
        reverse(ch);
        // Print the array
        for (int i = 0; i < ch.length; i ++) {
            System.out.printf("%c",ch[i]);
        }
    }
}
