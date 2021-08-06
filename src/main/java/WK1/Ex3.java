package WK1;

import java.util.Scanner;

public class Ex3 {
    public static  class Circle {
        // Atribute
        public int x;
        public int y;
        public int r;

        //Constructor

        public Circle() {
            this.x = 0;
            this.y = 0;
            this.r = 0;
        }

        public Circle(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }

        //Setter
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
        public void setR(int r) {
            this.r = r;
        }

        // Methode
        public int distancecenter (Circle ob1) {
            int dis = (int)Math.sqrt(((ob1.x - this.x) * (ob1.x - this .x) + (ob1.y - this.y) * (ob1.y - this.y)));
            return dis;
        }

        public void isoverlapse(Circle ob1) {
            if (distancecenter(ob1) > ob1.r + this.r) {
                System.out.println("Two circle does not cover each other");
            } else if (distancecenter(ob1)  <= ob1.r + this.r ) {
                if (distancecenter(ob1) <= this.r) {
                    System.out.println("Circle 2 is inside circle 1");
                } else if (distancecenter(ob1) <= ob1.r) {
                    System.out.println("Circle 1 is inside circle 2");
                } else {
                    System.out.println("2 Circle overlap");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle ob1 = new Circle();
        Circle ob2 = new Circle();
        //Prompt user input
        System.out.println("Enter the first Circle x,y,r: ");
        ob1.setX(input.nextInt());
        ob1.setY(input.nextInt());
        ob1.setR(input.nextInt());
        System.out.println("Enter the second Circle x,y,r: ");
        ob2.setX(input.nextInt());
        ob2.setY(input.nextInt());
        ob2.setR(input.nextInt());
        // Check if the circle lie inside
        ob1.isoverlapse(ob2);
    }
}
