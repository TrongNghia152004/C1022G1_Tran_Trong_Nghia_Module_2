package loop_array;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int count = 0;
        int N = 0;
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 2; i < 100; i++) {
            for (long j = 2; j <= Math.sqrt(i); j++) {
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
