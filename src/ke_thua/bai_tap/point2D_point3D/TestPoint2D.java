package ke_thua.bai_tap.point2D_point3D;

import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("Input b: ");
        float b = Float.parseFloat(scanner.nextLine());
        Point2D point2D = new Point2D(a, b);
        System.out.println(point2D.toString());
    }
}
