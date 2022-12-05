package loop_array;

import java.util.Scanner;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên");
        int size = Integer.parseInt(scanner.nextLine());
        int count = 0;
        System.out.println(size + " sô nguyên tố đầu tiên ");
        for (int i = 2; count < size; i++) {
            int N = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    N++;
                }
            }
            if (N == 0) {
                System.out.println(i);
                count++;
            }
        }
    }

}
