package WK3;

public class Rectangle {
    public static  class Rect {
        // Atribute
        private double width;
        private double height;
        //Constructor
        public Rect() {
          this.width = 1;
          this.height = 1;
        }

        public Rect(double w, double h) {
            this.width = w;
            this.height = h;
        }
        //Getter
        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        // Setter
        public void setWidth(double width) {
            this.width = width;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public void setAll(double h, double w) {
            setHeight(h);
            setWidth(w);
        }

        //Methode
        public double getArea() {
            return this.getHeight() * this.getWidth();
        }

        public double getPerimeter() {
            return (this.getHeight() + this.getWidth()) * 2;
        }

        @Override
        public String toString() { return "Triangle have Height : " + getHeight() + " and Width: " + getWidth() + "\n Have A = " + getArea() +" and Perimeter = " + getPerimeter() ;}
    }

    public static void main(String[] args) {
        Rect ob1 = new  Rect();
        Rect ob2 = new Rect(3.5,35.9);
        ob1.setAll(40,4);
        System.out.println(ob1);
        System.out.println(ob2);



    }


}
