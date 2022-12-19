package SearchAlgorithm.thuc_hanh;

import java.util.*;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        int [] characters = new int[255];
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            characters[ascii] += 1;
        }
        int max = 0;
        char character = 225;
        for (int i = 0; i < character; i++) {
            if (characters[i] > max){
                max = characters[i];
                character = (char) i;
            }
        }
        System.out.println("Ki tự xuất hiện nhiều nhất là " + character + " và tần suất xuất hiện là: " + max);
    }
}
