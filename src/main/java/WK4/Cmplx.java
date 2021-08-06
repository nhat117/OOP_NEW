package WK4;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Cmplx {
    //Driver code
        public static void main (String[]args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first complex number: ");
            double a = getNumber(input);
            double b = getNumber(input);

            cmplxnum complex1 = new cmplxnum(a, b);

            System.out.println("Enter the second complex number: ");
            a = getNumber(input);
            b = getNumber(input);
            cmplxnum complex2 = new cmplxnum(a, b);

            System.out.println(complex1 + " + " + complex2 + " = " + complex1.add(complex2));
            System.out.println(complex1 + " - " + complex2 + " = " + complex1.subtract(complex2));
            System.out.println(complex1 + " * " + complex2 + " = " + complex1.multiply(complex2));
            System.out.println(complex1 + " / " + complex2 + " = " + complex1.divide(complex2));

        }

        public static double getNumber(Scanner input){
            double number;
            while (!input.hasNextDouble() && !input.hasNextInt()) {
                if (!input.hasNextDouble() && !input.hasNextInt()) {
                    System.out.println("It must be a number!");
                }
                System.out.println("Re Enter:");
                input.next();
            }
            number = parseDouble(input.next());
            return number;
        }

        public static  class cmplxnum {
            private double Im;
            private double Rez;
            // Constructor
            public cmplxnum() {
                this.Im = 0;
                this.Rez = 0;
            }

            public cmplxnum(double im, double rez) {
                this.Im = im;
                this.Rez = rez;
            }
            // Getter
            public double getIm() {
                return Im;
            }

            public double getRez() {
                return Rez;
            }
            // Setter

            public void setIm(double im) {
                Im = im;
            }

            public void setRez(double rez) {
                Rez = rez;
            }
            // Methode
            public cmplxnum add(cmplxnum in) {
                cmplxnum tmp = new cmplxnum();
                tmp.setRez(this.getRez()+in.getRez());
                tmp.setIm(this.getIm()+in.getIm());
                return  tmp;
            }

            public cmplxnum subtract(cmplxnum in) {
                cmplxnum tmp = new cmplxnum();
                tmp.setRez(this.getRez()- in.getRez());
                tmp.setIm(this.getIm() - in.getIm());
                return  tmp;
            }
            public cmplxnum multiply (cmplxnum in) {
                cmplxnum tmp = new cmplxnum();
                tmp.setRez(this.getRez()*in.getRez() - this.getIm()* in.getIm());
                tmp.setIm(this.getRez()*in.getRez() + this.getIm()* in.getIm());
                return  tmp;
            }

            public cmplxnum divide(cmplxnum inp)
            {
                cmplxnum tmp = new cmplxnum();
                tmp.setRez((this.getRez() * inp.getRez() + this.getIm() * inp.getIm()) / (Math.pow(inp.getRez(), 2) + Math.pow(inp.getIm(), 2)));
                tmp.setIm((this.getIm() * inp.getRez() - this.getRez() * this.getIm()) / (Math.pow(inp.getRez(), 2) + Math.pow(inp.getIm(), 2)));
                return  tmp;
            }

            public double abs() {
                return Math.sqrt(Math.pow(this.getRez(),2) + Math.pow(this.getIm(),2));
            }

            @Override
            public String toString() {
                return this.getRez()  + " + "  + this.getIm() + "i";
            }
        }
}
