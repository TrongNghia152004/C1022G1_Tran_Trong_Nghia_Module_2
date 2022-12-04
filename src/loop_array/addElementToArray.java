package loop_array;

import java.util.Scanner;

public class addElementToArray {
    public static void main(String[] args) {
        int number, i, addNumber, index = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng");
            number = Integer.parseInt(scanner.nextLine());
        } while (number <= 0);
        int[] array = new int[number];
        System.out.println("Nhập các phần tử trong mảng");
        for (i = 0; i < number; i++) {
            System.out.println("Nhập phần tử thứ " + i + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập add là số cần chèn");
        addNumber = Integer.parseInt(scanner.nextLine());
        while (index < 0 || index >= number) {
            System.out.println("Nhập index cần chèn add vào trong mảng");
            index = Integer.parseInt(scanner.nextLine());
        }
        for (i = number - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        for (i = 0; i < number; i++) {
            System.out.println(array[i]);
        }
        array[index] = addNumber;
        System.out.println("Mảng sau khi chèn phần tử " + addNumber + " ở vị trí " + index);
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");
        }
    }
}

