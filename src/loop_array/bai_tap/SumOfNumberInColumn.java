package loop_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumberInColumn {
    public static void main(String[] args) {
        int i, j, sum = 0;
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
            }
        }
        System.out.println("Bạn muốn tính tổng cột nào? ");
        int num = Integer.parseInt(scanner.nextLine());
        for (i = 0; i < arr.length; i++) {
            sum += arr[i][num];
        }

        System.out.println("Tổng các phần tử ở cột " + num + " là: " + sum);
    }
}
