package WK3;

public class Intersect {
    public static class Line {
        private int x1, y1, x2, y2;
        private int e;
        private int f;

        //Constructor
        public Line() {
            x1 = y1 = x2 = y2 = e = f= 0;
        }

        public Line(int a, int b, int c, int d) {
            this.x1 = a;
            this.y1 = b;
            this.x2 = c;
            this.y2 = d;
            this.e = this.x2 - this.x1;
            this.f = this.y2 - this.y1;
        }
        //Getter

        public int getX1() {
            return x1;
        }

        public int getY1() {
            return y1;
        }

        public int getX2() {
            return x2;
        }

        public int getY2() {
            return y2;
        }

        public int getE() {
            return e;
        }

        public int getF() {
            return f;
        }

        // Methode

        public void intersectpoint(Line input) {
            if (input.getE() / this.getE() == input.getF() / this.getF() && input.getE() == this.getE() && input.getF() == this.getF()) {
                System.out.println("Two line is the same");
            } else if (input.getE() / this.getE() == input.getF() / this.getF()) {
                System.out.println("Two line is not intersect");
            } else {
                int c1 = -this.getE() * this.getX1() - this.getE() * this.getY1();
                int c2 = -input.getE() * input.getX1() - input.getE() * input.getY1();
                int x = (this.getF() * c2 - input.getF() * c2) / (this.getE() * input.getF() - input.getE() * this.getF());
                int y = (c1 * input.getE() - c2 * this.getE()) / (this.getE() * input.getF() - input.getE() * this.getF());
                System.out.println("Intersection point: ");
                System.out.printf("x = %d   y = %d", x, y);
            }
        }
    }

    public static void main(String[] args) {
        Line l1 = new Line(1,2,3,4);
        Line l2 = new Line(1,4,3,4);
        l1.intersectpoint(l2);

    }
}
