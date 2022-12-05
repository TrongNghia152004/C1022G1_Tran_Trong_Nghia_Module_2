package loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementOfArrayTwoWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1");
        int size1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài mảng 2");
        int size2 = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[size1][size2];
        System.out.println("Nhập các phần tử cho ma trận");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("array [ " + i + " ]" + "[ " + j + " ]");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = array[0][0];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

        }
        System.out.println("Phần tử lớn nhất trong ma trận: " + max);

    }
}
