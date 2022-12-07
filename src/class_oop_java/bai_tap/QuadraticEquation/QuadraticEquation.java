package class_oop_java.bai_tap.QuadraticEquation;


public class QuadraticEquation {
    private double a, b, c, delta, r1, r2, r12;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return delta = this.b * this.b - 4 * this.a * this.c;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getR1() {
        return r1 = (-this.b + Math.sqrt(this.b * this.b - 4 * this.c * this.a)) / 2;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }

    public double getR2() {
        return r2 = (-this.b - Math.sqrt(this.b * this.b - 4 * this.c * this.a)) / 2;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    public double getR12() {
        return r12;
    }

    public void setR12(double r12) {
        this.r12 = -this.b / 2 * this.a;
    }
}

