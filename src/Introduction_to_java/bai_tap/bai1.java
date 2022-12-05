package Introduction_to_java;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
