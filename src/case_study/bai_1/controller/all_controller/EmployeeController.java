package case_study.bai_1.controller.all_controller;

import case_study.bai_1.controller.FuramaController;

import java.util.Scanner;

public class EmployeeController {
    public static void employeeController(){
        System.out.println("Mời bạn chọn menu: ");
        System.out.println("1. Display list employees\n"
                + "2. Add new employee\n"
                + "3. Delete employee\n"
                + "4. Edit employee\n"
                + "5. Return main menu\n"
        );
        do {
            System.out.println("Mời bạn nhập menu: ");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("hello 1");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.err.println("Mời bạn nhập lại: ");
            }
        }while (true);
    }
}
