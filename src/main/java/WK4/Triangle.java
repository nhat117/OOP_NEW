package WK4;

import java.util.Scanner;

public class Triangle {
    public static class Triag {
        //Data field
        private double side1;
        private double side2;
        private double side3;
        private String color;
        private boolean filled;
        // Constructor
        public Triag() {
            this.side1 = 1.0;
            this.side2 = 1.0;
            this.side3 = 1.0;
            this.color = "None";
        }

        public Triag(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.color = "None";
        }
        // Getter

        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        public String getColor() {
            return color;
        }

        public boolean isFilled() {
            return filled;
        }

        // Setter

        public void setSide1(double side1) {
            this.side1 = side1;
        }

        public void setSide2(double side2) {
            this.side2 = side2;
        }

        public void setSide3(double side3) {
            this.side3 = side3;
        }

        public void setColor(String color) {
            this.color = color;
            this.filled = true;
        }

        // Methode
        public double getArea() {
            double s = (getSide1() + getSide2() + getSide3()) / 2;
            return Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
        }

        public double getPerimeter() {
           return getSide1() + getSide2() + getSide3();
        }

        @Override
        public String toString() {
            if (isFilled()) {
                return "Triangle: side 1 = " + getSide1() + " side 2 = " + getSide2() + " side3 = " + getSide3()
                        + " have the color " + getColor() +" P = " + getPerimeter() + " A = " + getArea();
            }
            return "Triangle: side 1 = " + getSide1() + " side 2 = " + getSide2() + " side3 = " + getSide3()
                    + " P = " + getPerimeter() + " A = " + getArea();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side 1, side 2, side 3, color");
        double [] arr = new double[3];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = input.nextDouble();
        }
        String k = input.next();
        Triag Ob1 = new Triag(arr[0],arr[1],arr[2]);
        if (!k.equals("none")) {
            Ob1.setColor(k);
        }

        System.out.println(Ob1);
    }
}
