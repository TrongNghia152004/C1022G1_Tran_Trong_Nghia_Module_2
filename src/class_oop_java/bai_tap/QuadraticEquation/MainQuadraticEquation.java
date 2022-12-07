package class_oop_java.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDelta() > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt là: ");
            System.out.println("x1 = " + quadraticEquation.getR1());
            System.out.println("x2 = " + quadraticEquation.getR2());
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("Phương trình có nghiệm kép là : ");
            System.out.println("x1 = x2 = " + quadraticEquation.getR12());
        } else if (quadraticEquation.getDelta() < 0) {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
