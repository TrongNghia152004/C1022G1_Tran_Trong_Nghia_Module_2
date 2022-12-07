package access_modifier.bai_tap.student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập class: ");
        String classes = scanner.nextLine();
        Student student = new Student();
        student.setName(name);
        student.setClasses(classes);
        System.out.println("Họ và tên: " + student.getName());
        System.out.println("Lớp: " + student.getClasses());
    }
}
