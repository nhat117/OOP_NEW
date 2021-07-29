package WK2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShowOccurenceOfNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter integers btw 1 and 100: ");
        int tmp;
        do {
            tmp = input.nextInt();
            arr.add(tmp);
        } while (tmp != 0);
        scoreFilter(arr);
    }

    //Use frequency methode
    public static void scoreFilter(ArrayList<Integer> arrInput) {
        for (int i = 1; i < 100; i++) {
            int occur = Collections.frequency(arrInput, i);
            if (occur == 1) {
                System.out.println(i + " occur:  " + occur + "time ");
            } else if (occur > 1) {
                System.out.println(i + " occurs:  " + occur + "times ");
            }
        }
    }
}
