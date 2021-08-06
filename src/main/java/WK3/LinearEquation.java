package WK3;

import java.util.Scanner;

public class LinearEquation {
    public static class LE {
        private int a, b, c, d, e, f;

        //Constructor
        public LE() {
            a = b = c = d = e = f = 0;
        }

        public LE(int a, int b, int c, int d, int e, int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        //Getter

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        public int getD() {
            return d;
        }

        public int getE() {
            return e;
        }

        public int getF() {
            return f;
        }

        // Methode
        public boolean isSolvable() {
            if ((this.getA() * this.getD() - this.getB() * this.getC()) != 0) {
                return true;
            } else if ((this.getA() * this.getD() - this.getB() * this.getC()) == 0) {
                System.out.println("The eqn have no solution");
                return false;
            }
            return false;
        }

        public int getX() {
            return (this.getE() * this.getD() - this.getB() * this.getF()) / (this.getA() * this.getD() - this.getB() * this.getC());
        }

        public int getY() {
            return (this.getA() * this.getF() - this.getE() * this.getC()) / (this.getA() * this.getD() - this.getB() * this.getC());
        }

        @Override
        public String toString() {
            StringBuilder tmp = new StringBuilder();
            tmp.append(String.valueOf(this.getA()));
            tmp.append("x + ");
            tmp.append(String.valueOf(this.getB()));
            tmp.append("y = ");
            tmp.append(String.valueOf(this.getE()));
            tmp.append("\n");
            tmp.append(String.valueOf(this.getC()));
            tmp.append("x + ");
            tmp.append(String.valueOf(this.getD()));
            tmp.append("y = ");
            tmp.append(String.valueOf(this.getF()));
            tmp.append("\n");
            return tmp.toString();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []a = new int[6];
        System.out.println("Enter a b c d and e f");
        for (int i = 0; i < 6; i ++) {
            a[i] = input.nextInt();
        }

        LE k = new LE(a[0],a[1],a[2],a[3],a[4],a[5]);
        System.out.println(k);
        System.out.println(k.isSolvable());
    }
}

