package WK3.LO;

public abstract class  Equation {
    private float a,b,c;

    //Constructor
    public Equation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Equation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Getter

    public float getA() {
        return a;
    }
    public float getB() {
        return b;
    }
    public float getC() {
        return c;
    }

    //Setter

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }
}
