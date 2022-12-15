package stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn chuyển đổi: ");
        int n = Integer.parseInt(scanner.nextLine());
        Stack stack = new Stack();
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }
        System.out.println("Chuyển từ thập phân sang nhị phân: ");
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}
