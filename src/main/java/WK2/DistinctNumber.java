package WK2;



import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        printDistinctNumber(chkDistinctNumber(arr));
    }

    public static ArrayList<Integer> chkDistinctNumber(int[] arrInput) {
        int count = 0;
        ArrayList<Integer> distinct = new ArrayList<Integer>();
        for (int i = 1; i < 100; i++) {
            int occurence = occurenceCount(arrInput, 0, arrInput.length - 1, i);
            if (occurence == 1) {
                count++;
                distinct.add(i);
            }
        }
        System.out.println("The number of distinc number is: " + count);
        return distinct;
    }

    public static void printDistinctNumber(ArrayList<Integer> distinct) {
        System.out.print("The number of distinct number is: ");
        for (int i : distinct) {
            System.out.print(i + " ");
        }
    }


    public static int occurenceCount(int[] arrInput, int lowPoint, int highPoint, int key) {
        //Using devide and conquer
        //Devide
        //If there is no element appear on the array
        if ((lowPoint > highPoint) || (lowPoint == highPoint && arrInput[lowPoint] != key)) {
            return 0;
        }
        //If exist the single element equal to the key
        if (highPoint == lowPoint && arrInput[lowPoint] == key) {
            return 1;
        }

        //Devide the array into twopart
        return occurenceCount(arrInput, lowPoint, (lowPoint + highPoint) / 2, key)
                + occurenceCount(arrInput, 1 + (lowPoint + highPoint) / 2, highPoint, key);
    }

}