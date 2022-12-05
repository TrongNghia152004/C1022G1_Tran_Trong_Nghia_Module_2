package loop_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementOfArrayTwoWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài dòng");
        int sizeCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài cột");
        int sizeRow = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[sizeRow][sizeCol];
        System.out.println("Nhập các phần tử cho ma trận");
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                System.out.println("array [ " + i + " ]" + "[ " + j + " ]");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = array[0][0];
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

        }
        System.out.println("Phần tử lớn nhất trong ma trận: " + max);

    }
}
