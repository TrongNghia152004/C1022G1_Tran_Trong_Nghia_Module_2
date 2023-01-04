package case_study.bai_1.controller;

import case_study.bai_1.controller.all_controller.BookingController;
import case_study.bai_1.controller.all_controller.CustomerController;
import case_study.bai_1.controller.all_controller.EmployeeController;
import case_study.bai_1.controller.all_controller.FacilityController;
import case_study.bai_1.controller.all_controller.PromotionController;
import case_study.bai_1.util.NotFoundException;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        do {
            System.out.println("----------Menu:----------\n" +
                    "1. Employee Management\n"
                    + "2. Customer Management\n"
                    + "3. Facility Management\n"
                    + "4. Booking Management\n"
                    + "5. Promotion Management\n"
                    + "6. Exit");
            System.out.println("Please choose menu:");
            Scanner sc = new Scanner(System.in);
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        try {
                            EmployeeController.employeeController();
                        } catch (NotFoundException e) {
                            e.printStackTrace();
                        }
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
                        System.err.println("Input number 1 to 6: ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input number");
            }
        } while (true);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}

