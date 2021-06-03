import java.util.Scanner;
public class Ex2 {

    public static void countchar (int [] array){
        int count = 0;
        for (int i = 1; i <= 100; i ++) {
            count = 0;
            for (int index = 0; index < array.length; index ++) {
                if (array[index] == i) {
                    count ++;
                } else {
                    continue;
                }
            }
            if (count == 0) {
                continue;
            } else {
                System.out.println(i + " occured " + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = input.nextInt();
        int [] array = new int[size];
        System.out.println("Enter a number from 1 to 100");
        for (int i = 0; i < size ; i ++) {
            int tmp = 0;
            while (true) {
                tmp = input.nextInt();
                if (tmp < 0 || tmp > 100) {
                    System.out.println("Please try again");
                } else {
                    array[i] = tmp;
                    break;
                }
            }
            if (array[i] == 0) {break;}
        }
        countchar(array);
    }
}
