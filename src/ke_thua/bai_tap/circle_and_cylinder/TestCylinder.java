package ke_thua.bai_tap.circle_and_cylinder;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius: ");
        float radius = Float.parseFloat(scanner.nextLine());
        System.out.println("Input color: ");
        String color = scanner.nextLine();
        System.out.println("Input length: ");
        float height = Float.parseFloat(scanner.nextLine());
        Cylinder cylinder = new Cylinder(radius, color, height);
        System.out.println(cylinder);
    }
}
