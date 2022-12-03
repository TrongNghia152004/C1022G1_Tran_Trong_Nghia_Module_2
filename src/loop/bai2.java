package loop;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên");
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int N = 0;
        System.out.println(number + " sô nguyên tố đầu tiên ");
        for (int i = 2; count < number; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    N++;
                }
            }
            if (N == 0) {
                System.out.println(i);
                count++;
            }
            N = 0;
        }
    }
}
