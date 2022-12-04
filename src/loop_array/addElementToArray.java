package loop_array;

import java.util.Scanner;

public class addElementToArray {
    public static void main(String[] args) {
        int number ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng");
            number = Integer.parseInt(scanner.nextLine());
        }while (number <= 0);
        int [] array = new int[number];
    }
}
