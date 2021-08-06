import java.util.Scanner;

public class Chcksoted {
    public static boolean ifsorted (int [] array) {
        for (int i = 0; i < array.length -1; i ++) {
            if (array[i] > array [i+1])  {
                return false;
            }
        }
        return true;
    }


    public static void display(int [] array) {
        if (!ifsorted(array) ) {
            System.out.println(" The list is not sorted");
        } else {
            System.out.println("The list is sorted");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of list");
        int size = input.nextInt();
        int [] array = new int[size];
        System.out.println("Enter a list of number : ");
        for (int i = 0; i < array.length ; i ++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
        display(array);
    }
}
