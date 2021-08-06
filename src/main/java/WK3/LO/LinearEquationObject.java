package WK3.LO;


public class LinearEquationObject extends Equation {
    public LinearEquationObject (float a, float b, float c) {
        super(a, b, c);
    }

    public float getDiscriminant() {
        return super.getB() * super.getB() - (4 * super.getA()* super.getC());
    }

    public void getRoot1() {
        if (this.getDiscriminant() == 0){
            System.out.println("Discriminant is negative");
            return;
        }

        System.out.println ((-super.getB() + Math.sqrt(this.getDiscriminant()) ) / (2 * super.getA()));
    }

    public void getRoot2() {
        if (this.getDiscriminant() == 0){
            System.out.println("Discriminant is negative");
            return;
        }
        System.out.println ((-super.getB() + Math.sqrt(this.getDiscriminant()) ) / (2 * super.getA()));
    }

}
