package case_study.bai_1.controller.all_controller;

import case_study.bai_1.controller.FuramaController;

import java.util.Scanner;

public class FacilityController {
    public static void facilityController(){
        System.out.println("Mời bạn chọn menu: ");
        System.out.println("1. Display list facility\n"
                + "2. Display new facility\n"
                + "3. Edit facility\n"
                + "4. Return main menu"
        );
        do {
            System.out.println("Mời bạn nhập menu: ");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.err.println("Mời bạn nhập lại: ");
            }
        }while (true);
    }
}
