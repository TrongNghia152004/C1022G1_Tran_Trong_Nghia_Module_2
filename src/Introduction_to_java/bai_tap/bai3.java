package Introduction_to_java.bai_tap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị USD");
        int USD = Integer.parseInt(scanner.nextLine());
        int rate = USD * 23000;
        System.out.println(USD + " USD có tỉ giá là : " + rate + " VNĐ");
    }
}
