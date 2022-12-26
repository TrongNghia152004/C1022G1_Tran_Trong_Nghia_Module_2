package ss18_string_and_regex.bai_tap;

import java.util.Scanner;

public class RunRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String className = sc.nextLine();
        System.out.println(className.matches(Regex.REGEX_CLASSNAME));
        System.out.println("Nhập số điện thoại");
        String phoneNumber = sc.nextLine();
        System.out.println(phoneNumber.matches(Regex.REGEX_PHONENUMBER));
    }
}
