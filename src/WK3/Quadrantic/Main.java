package WK3.Quadrantic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c,d,e,f : ");
        Scanner input = new Scanner(System.in);
        float [] arr = new float[6];

        for(int i = 0; i < arr.length; i ++) {
            arr[i] = input.nextFloat();
        }

        LinearEquation le = new LinearEquation(arr[0], arr[1],arr[2],arr[3],arr[4],arr[5]);
        System.out.println(le);
    }
}
