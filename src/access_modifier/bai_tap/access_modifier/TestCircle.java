package access_modifier.bai_tap.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        int radius = Integer.parseInt(scanner.nextLine());
        Circle circle = new Circle(radius);
        System.out.println("Bán kính hình tròn là: " + circle.getRadius());
        System.out.println("Diện tích hình tròn là : " + circle.getArea());
    }
}
