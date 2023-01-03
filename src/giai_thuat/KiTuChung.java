package giai_thuat;

import java.util.Scanner;

public class KiTuChung {
    public static String timKiTuChung(String str1 , String str2){
        String str3 = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)){
                    str3 = str3 + str1.charAt(i);
                    str2 = str2.substring(0,j) + str2.substring(j + 1);
                    break;
                }
            }
        }return str3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi 1:");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi 2:");
        String str2 = sc.nextLine();
        System.out.println(timKiTuChung(str1,str2));
    }
}
