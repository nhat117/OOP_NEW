package WK3.Quadrantic;

public class LinearEquation {
    //Constructor

    private Eqn eqn1, eqn2;
    public LinearEquation(float a, float b, float c, float d, float e, float f) {
        this.eqn1 = new Eqn(a,b,e);
        this.eqn2 = new Eqn(c,d,f);
       delim(eqn1, eqn2);
    }



    private float delim(Eqn eqn1, Eqn eqn2) { return (eqn1.getA() * eqn2.getB()) - (eqn1.getB() * eqn2.getA());}


    private boolean isSolvable() {
        return (this.delim(eqn1, eqn2) != 0) ?  true :  false;
    }

    //Get root
    private float getX() {
        return (isSolvable()) ? (eqn1.getC() * eqn2.getB()- eqn1.getB() * eqn2.getC()) / delim(eqn1, eqn2) : null;
    }

    private float getY() {
        return (isSolvable()) ? (eqn1.getA() * eqn2.getC()- eqn1.getC() * eqn2.getA()) / delim(eqn1, eqn2) : null;
    }

    @Override
    public String toString() {
        return (!isSolvable()) ? "the equation is unsolvable" : "root X: " + getX() + "\n" + "root Y: " + getY() + "\n";
    }
}
