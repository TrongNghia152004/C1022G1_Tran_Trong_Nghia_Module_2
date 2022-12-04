package loop_array;

import java.util.Scanner;

public class deleteArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, i, j, delete;
        do {
            System.out.println("Nhập độ dài mảng");
            number = Integer.parseInt(scanner.nextLine());
        } while (number <= 0);
        int [] array = new int[number];
        System.out.println("Nhập các phần tử trong mảng");
        for (i = 0; i < number; i++) {
            System.out.print("Nhập phần tứ thứ " + i + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập delete là số cần xoá: ");
        delete = Integer.parseInt(scanner.nextLine());
        for (j = i = 0; i < number; i++) {
            if (array[i] != delete) {
                array[j] = array[i];
                j++;
            }
        }
        number = j;
        System.out.println("Mảng còn lại sau khi xoá phần tử " + delete + " là: ");
        for (i = 0; i < number; i++) {
            System.out.println(array[i] + "\t");
        }
    }
}
