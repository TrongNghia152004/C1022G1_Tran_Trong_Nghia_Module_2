package loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng");
            number = Integer.parseInt(scanner.nextLine());
        } while (number <= 0);
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập số bạn muốn thêm vào: ");
        int find = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí bạn muốn: ");
        int index = Integer.parseInt(scanner.nextLine());
        array = Arrays.copyOf(array, array.length + 1);
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = find;
        System.out.println(Arrays.toString(array));

    }
}

