package WK1;

import java.util.Scanner;

public class Ex1 {

    static  void swap (int [] arrint, int index) {
        int tmp = 0;
        //Swap element
        tmp = arrint[index + 1];
        arrint [index + 1] = arrint[index];
        arrint[index] = tmp;
    }

    static void BubbleSort (int [] arrint) {
        int len = arrint.length;
        for (int i = 0; i < len - 1 ; i ++) {
            for (int j = 0; j < len - i - 1; j ++) {
                if (arrint[j+1] > arrint [j])
                swap(arrint, j);
            }
        }
    }
    static void Display (int [] arrint) {
        for (int i = 0; i < arrint.length; i ++) {
            System.out.println(arrint[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1, 2 3 number");
        int [] arrint = new int[3];
        // Take in the input
        for (int i = 0; i < arrint.length; i ++) {
            arrint [i] = input.nextInt();
        }
        // Sort the array
        BubbleSort(arrint);
        // Out put
        Display(arrint);
    }
}
