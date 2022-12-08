package ke_thua.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intput radius: ");
        float radiusCircle = Float.parseFloat(scanner.nextLine());
        System.out.println("Input color: ");
        String colorCircle = scanner.nextLine();
        Circle circle = new Circle(radiusCircle, colorCircle);
        System.out.println(circle);
        System.out.println("Intput radius: ");
        float radiusCylinder = Float.parseFloat(scanner.nextLine());
        System.out.println("Input color: ");
        String colorCylinder = scanner.nextLine();
        System.out.println("Input length: ");
        float height = Float.parseFloat(scanner.nextLine());
        Cylinder cylinder = new Cylinder(radiusCylinder, colorCylinder, height);
        System.out.println(cylinder);
    }
}
