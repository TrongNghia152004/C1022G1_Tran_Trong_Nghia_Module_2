package ke_thua.bai_tap.point2D_point3D;

import java.util.Scanner;

public class TestPoint3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("Input b: ");
        float b = Float.parseFloat(scanner.nextLine());
        System.out.println("Input c: ");
        float c = Float.parseFloat(scanner.nextLine());
        Point3D point3D = new Point3D(a, b, c);
        System.out.println(point3D.toString());

    }
}
