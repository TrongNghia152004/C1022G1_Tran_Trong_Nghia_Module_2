package loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, delete;
        System.out.println("Nhập độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        System.out.println("Nhập các phần tử trong mảng");
        for (i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tứ thứ " + i + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập delete là số cần xoá: ");
        delete = Integer.parseInt(scanner.nextLine());
        for (i = 0; i < array.length; i++) {
            if (array[i] == delete) {
                for (j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
