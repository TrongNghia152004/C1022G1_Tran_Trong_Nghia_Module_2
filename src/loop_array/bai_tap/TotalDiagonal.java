package loop_array.bai_tap;

import java.util.Scanner;

public class TotalDiagonal {
    public static void main(String[] args) {
        int i, j;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài dòng");
        int sizeRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài cột");
        int sizeCol = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[sizeRow][sizeCol];
        for (i = 0; i < sizeRow; i++) {
            for (j = 0; j < sizeCol; j++) {
                System.out.println("array [ " + i + " ]" + "[ " + j + " ]");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số đường chéo trính trong ma trận: " + sum);
    }
}
