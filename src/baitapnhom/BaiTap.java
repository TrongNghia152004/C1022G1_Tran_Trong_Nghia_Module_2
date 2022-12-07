package baitapnhom;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int count = 0;
        int count1 = 0;
        int a = 0;
        int b = 1;
        int fibo = 0;
        int i = 0;
        while (count < n){
            a = b;
            b = fibo;
            fibo = a + b;
            if (isPrimeNumber(fibo)){
                arr[i] = fibo;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
            }

}
