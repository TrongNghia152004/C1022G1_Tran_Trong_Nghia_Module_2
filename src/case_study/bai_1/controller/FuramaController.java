package case_study.bai_1.controller;

import case_study.bai_1.controller.all_controller.BookingController;
import case_study.bai_1.controller.all_controller.CustomerController;
import case_study.bai_1.controller.all_controller.EmployeeController;
import case_study.bai_1.controller.all_controller.FacilityController;
import case_study.bai_1.controller.all_controller.PromotionController;

import java.util.Scanner;

public class FuramaController {
        public static void displayMainMenu() {
            System.out.println("----------Menu:----------\n" +
                    "1. Employee Management\n"
                    + "2. Customer Management\n"
                    + "3. Facility Management\n"
                    + "4. Booking Management\n"
                    + "5. Promotion Management\n"
                    + "6. Exit");
            do {
                System.out.println("Mời bạn nhập menu: ");
                Scanner sc = new Scanner(System.in);
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        EmployeeController.employeeController();
                        break;
                    case 2:
                        CustomerController.customerController();
                        break;
                    case 3:
                        FacilityController.facilityController();
                        break;
                    case 4:
                        BookingController.bookingController();
                        break;
                    case 5:
                        PromotionController.promotionController();
                        break;
                    case 6:
                        System.out.println("Exit");
                        break;
                    default:
                        System.err.println("Mời bạn nhập lại: ");
                }
            }while (true);
        }
    public static void main(String[] args) {
        displayMainMenu();
    }
    }

