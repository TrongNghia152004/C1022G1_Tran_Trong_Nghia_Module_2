package loop_array;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu có: 1.Print the rectangle 2.Print the square triangle 3.Print isosceles triangle 4.Exit");
        System.out.println("Nhập menu bạn muốn chọn");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều cao");
        int h = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
//                1.Print the rectangle
                System.out.println("Nhập chiều dài");
                int a = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < a; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
//              Print the square triangle botton-left

                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
//               2.Print the square triangle botton-right
                for (int i = 1; i <= h; i++) {
                    for (int j = h - i - 1; j >= 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
//               2.Print the square triangle top-left
                for (int i = 0; i <= h; i++) {
                    for (int j = h - i - 1; j >= 0; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
//                2.Print the square triangle top-right
                for (int i = 1; i <= h; i++) {
                    for (int j = h + i - 1; j > h; j--) {
                        System.out.print(" ");
                    }
                    for (int k = h; k >= i; k--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
//              3.Print isosceles triangle
                for (int i = 1; i <= h; i++) {
                    for (int j = h; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i * 2 - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Số bạn nhập không có trong menu");
                break;
        }
    }

}
