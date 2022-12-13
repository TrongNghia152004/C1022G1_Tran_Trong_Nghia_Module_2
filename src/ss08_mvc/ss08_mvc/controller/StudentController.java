package ss08_mvc.controller;

import ss08_mvc.model.Student;
import ss08_mvc.service.IStudentService;
import ss08_mvc.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    private static IStudentService service = new StudentServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("-----Student Manager-------");
            System.out.println("1. List");
            System.out.println("2. Add");
            System.out.println("3. Exit");

            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1: //list
                    Student studentList[] = service.findAll();
                    for(Student student: studentList){
                        System.out.println(student);
                    }
                    break;
                case 2: //add
                    System.out.print("Input ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input Name: ");
                    String name = scanner.nextLine();
                    service.addStudent(new Student(id, name));
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
