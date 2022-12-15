package stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class SwapElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Đảo ngược mảng
        System.out.println("Nhập độ dài mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử ở vị trí: " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
            stack.push(arr[i]);
        }
        System.out.println("Mảng trả về: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + "\t");
        }
        System.out.println('\n' + "Mảng ban đầu:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(stack.push(arr[i]) + "\t");
        }
        // Đảo ngược chuỗi
        Stack<String> wStack = new Stack<>();
        System.out.println("Nhập các phần tử trong chuỗi: ");
        String mWord = scanner.nextLine();
        String arr1[] = mWord.split("");
        for (int i = 0; i < arr.length; i++) {
            wStack.push(arr1[i]);
        }
        while (!wStack.empty()) {
            System.out.print(wStack.pop());
        }
    }
}
