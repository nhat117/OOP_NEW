package WK2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String []arr = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        arr[0] = input.nextLine();
        System.out.print("Enter the Second city: ");
        arr[1] = input.nextLine();
        System.out.print("Enter the Third city: ");
        arr[2] = input.nextLine();
        Arrays.sort(arr);
        System.out.print("The three city in alphabet order are: ");
        for (int i = 0; i < arr.length;i ++) {
            System.out.printf("%s ",arr[i]);
        }
    }
}
