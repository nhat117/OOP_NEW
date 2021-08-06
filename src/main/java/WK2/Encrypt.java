package WK2;

import java.util.Scanner;

public class Encrypt {

    public static String encrypt(String input) {
        StringBuilder tmp = new StringBuilder();
        String key = "QTGABCDEFHIJKLMNOPRSUVWXYZ" + "QTGABCDEFHIJKLMNOPRSUVWXYZ".toLowerCase();
        String ref = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        for (int i = 0; i < input.length(); i ++) {
            boolean flag = false;
            for (int j = 0; j < ref.length(); j ++) {
                if (input.charAt(i) == ref.charAt(j)) {
                    tmp.append(key.charAt(j));
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                tmp.append(input.charAt(i));
            }
        }
        return tmp.toString();
    }

    public static String decrypt(String input) {
        StringBuilder tmp = new StringBuilder();
        String key = "QTGABCDEFHIJKLMNOPRSUVWXYZ" + "QTGABCDEFHIJKLMNOPRSUVWXYZ".toLowerCase();
        String ref = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        for (int i = 0; i < input.length(); i ++) {
            boolean flag = false;
            for (int j = 0; j < ref.length(); j ++) {
                if (input.charAt(i) == key.charAt(j)) {
                    tmp.append(ref.charAt(j));
                    flag = true;
                    break;
                }

            }
            if (!flag) {
                tmp.append(input.charAt(i));
            }
        }
        return tmp.toString();
    }

    public static void menu (int input, String inp) {
        switch (input) {
            case 1 :
                System.out.printf("The %s is encrypted as %s\n",inp,encrypt(inp));
                break;
            case 2 :
                System.out.printf("The %s is decrypted as: %s\n",inp, decrypt(inp));
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner k = new Scanner(System.in);
        System.out.print("Enter 1 to encrypt, enter 2 to decrypt: ");
        String selection = input.next();
        System.out.print("Enter a string: ");
        String inp = k.nextLine();
        menu(Integer.valueOf(selection),inp);
    }
}
