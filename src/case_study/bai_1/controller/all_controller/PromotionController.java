package case_study.bai_1.controller.all_controller;

import case_study.bai_1.controller.FuramaController;

import java.util.Scanner;

public class PromotionController {
    public static void promotionController(){
        System.out.println("Mời bạn chọn menu: ");
        System.out.println("1. Display list customer use service\n"
                + "2. Display list customer get voucher\n"
                + "3. Return main menu"
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
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.err.println("Mời bạn nhập lại: ");
            }
        }while (true);
    }
}
