package ss15_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleEdgesCheck check = new TriangleEdgesCheck();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập cạnh a: ");
            double a = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập cạnh b: ");
            double b = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập cạnh c: ");
            double c = Double.parseDouble(sc.nextLine());
            check.triangleEdgesCheck(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println("a , b , c không phải là cạnh tam giác");
        }
    }
}
