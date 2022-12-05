package class_oop_java.bai_tap.QuadraticEquation;


public class QuadraticEquation {
    double a, b, c, delta, r1, r2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return delta = this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return r1 = (-this.b + Math.sqrt(this.b * this.b - 4 * this.c * this.a)) / 2;
    }

    public double getRoot2() {
        return r2 = (-this.b - Math.sqrt(this.b * this.b - 4 * this.c * this.a)) / 2;
    }

    public double getDoubleSolution() {
        return r1 = r2 = -this.b / 2 * this.a;
    }

}

