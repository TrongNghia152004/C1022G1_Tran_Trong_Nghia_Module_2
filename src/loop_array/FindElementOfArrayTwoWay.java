package loop_array;

import java.util.Scanner;

public class FindElementOfArrayTwoWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1");
        int length1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài mảng 2");
        int length2 = Integer.parseInt(scanner.nextLine());
        int [][] array = new int[length1][length2];
    }
}
