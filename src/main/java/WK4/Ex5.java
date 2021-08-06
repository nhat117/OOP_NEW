package WK4;

import java.util.Date;
import java.util.Scanner;

public class Ex5 {
    public static class SimpleGeometricObject {
        //Data field
        private String color;
        private boolean filled;
        private Date dateCreated;
        // Constructor
        // Default constructor
        public SimpleGeometricObject() {
            this.color = "white";
            this.filled = false;
            this.dateCreated = java.util.Calendar.getInstance().getTime();
        }

        public SimpleGeometricObject(String color) {
            this.color = color;
            this.filled = true;
            this.dateCreated = java.util.Calendar.getInstance().getTime();
        }

        // Getter

        public String getColor() {
            return color;
        }

        public boolean isFilled() {
            return filled;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        // Setter
        public void setColor(String color) {
            this.color = color;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public void setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
        }
        //Methode

        @Override
        public String toString() {
            if(this.isFilled()) {
                return "Object created on: " + getDateCreated() + "\nColor " + getColor();
            }
            return  "Object created on: " + getDateCreated() + " is not filled";
        }
    }
    // Driver code
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color");
        String inp = input.nextLine();
        if (!inp.equals("none")) {
            SimpleGeometricObject ob1 = new SimpleGeometricObject(inp);
            System.out.println(ob1);
            return;
        }
        SimpleGeometricObject ob1 = new SimpleGeometricObject();
        System.out.println(ob1);

    }
}


