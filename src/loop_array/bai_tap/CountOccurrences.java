package loop_array.bai_tap;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        int i, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các kí tự trong chuỗi");
        String str = scanner.nextLine();
        System.out.println("Nhập kí tự");
        char characters = scanner.nextLine().charAt(0);
        char[] arr = str.toCharArray();
        for (i = 0; i < arr.length; i++) {
            if (characters == arr[i]) {
                count++;
            }
        }
        System.out.println("Số lần kí tự " + characters + " xuất hiện trong chuỗi là: " + count);
    }
}
