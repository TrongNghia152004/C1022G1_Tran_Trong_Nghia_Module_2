package sort_algorithm.bai_tap;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortAlgorithm {
    // Hàm sắp xếp mảng sử dụng
    // Sắp xếp chèn
    public static void sortAlgorithm( int @NotNull [] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int length = Integer.parseInt(sc.nextLine());
        int []arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ:" + "arr[" + i + "]");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        sortAlgorithm(arr);
        System.out.println(Arrays.toString(arr));
    }
}