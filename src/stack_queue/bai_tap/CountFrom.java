package stack_queue.bai_tap;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountFrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapWord = new TreeMap<>();
        System.out.println("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();
        String word = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
                if (i == (str.length() - 1)) {
                    if (mapWord.containsKey(word)) {
                        mapWord.put(word, mapWord.get(word) + 1);
                    } else {
                        mapWord.put(word, 1);
                    }
                }
            } else {
                if (mapWord.containsKey(word)) {
                    mapWord.put(word, mapWord.get(word) + 1);
                    word = "";
                } else {
                    mapWord.put(word, 1);
                    word = "";
                }
                word = "";
            }
        }
        Set<String> keySet = mapWord.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + mapWord.get(key));
        }
    }
}
