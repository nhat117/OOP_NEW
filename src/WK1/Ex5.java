package WK1;

public class Ex5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 200; i ++) {
            if (i % 5 == 0) {
                if (i % 6 != 0) {
                    count ++;
                    if (count % 10 == 0) {
                        System.out.println(i);
                    } else {
                        System.out.print(i + " ");
                    }
                }
            } else if (i % 6 == 0) {
                if (i % 5 != 0) {
                    count ++;
                    if (count % 10 == 0) {
                        System.out.println(i);
                    } else {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}
