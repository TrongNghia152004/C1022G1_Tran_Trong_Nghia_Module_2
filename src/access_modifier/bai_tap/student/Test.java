package access_modifier.bai_tap.student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập class: ");
        String classes = scanner.nextLine();
        Student student = new Student(name, classes);
        System.out.println(student);
        student.setName("Nghĩa");
        student.setClasses("C1022G1");
        System.out.println(student);
    }
}
