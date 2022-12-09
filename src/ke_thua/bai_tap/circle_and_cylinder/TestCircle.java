package ke_thua.bai_tap.circle_and_cylinder;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intput radius: ");
        float radius = Float.parseFloat(scanner.nextLine());
        System.out.println("Input color: ");
        String color = scanner.nextLine();
        Circle circle = new Circle(radius , color);
        System.out.println(circle);
    }
}
