package loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int i, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1");
        int length1 = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[length1];
        for (i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng 1: ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập độ dài mảng 2");
        int length2 = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[length2];
        for (i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng 2: ");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        int length = arr1.length + arr2.length;
        int[] arr3 = new int[length];
        for (i = 0; i < arr1.length; i++) {
            arr3[count] = arr1[i];
            count++;
        }
        for (i = 0; i < arr2.length; i++) {
            arr3[count] = arr2[i];
            count++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
