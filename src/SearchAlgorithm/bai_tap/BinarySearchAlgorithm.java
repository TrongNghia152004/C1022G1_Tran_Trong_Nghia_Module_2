package SearchAlgorithm.bai_tap;

import java.util.*;

public class BinarySearchAlgorithm {
    public static int binarySearch(int[] array, int value, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] > value) {
                return binarySearch(array, value, left, right = middle - 1);
            } else if (value == array[middle]) {
                return middle;
            } else {
                return binarySearch(array, value, left, right = middle + 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ : " + "arr[" + i + "]");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập số bạn cần tìm");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(binarySearch(arr, num, 0, arr.length - 1));
    }
}
