package case_study.bai_1.controller.all_controller;

import case_study.bai_1.controller.FuramaController;
import case_study.bai_1.model.Customer;
import case_study.bai_1.service.all_class_service.CustomerServiceImpl;
import case_study.bai_1.service.all_service_interface.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    private static ICustomerService customerService = new CustomerServiceImpl();

    public static void customerController() {
        do {
            System.out.println("--------Menu-------\n: ");
            System.out.println("1. Display list customer\n"
                    + "2. Add new customer\n"
                    + "3. Edit customer\n"
                    + "4. Return main menu"
            );
            System.out.println("Please choose menu\n: ");
            Scanner sc = new Scanner(System.in);
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        System.out.println("Input customer id");
                        String customerId = sc.nextLine();
                        System.out.println("Input customer name");
                        String name = sc.nextLine();
                        System.out.println("Input customer date of birth");
                        String dateOfBirth = sc.nextLine();
                        System.out.println("Input customer gender");
                        String gender = sc.nextLine();
                        System.out.println("Input customer identity card");
                        String identityCard = sc.nextLine();
                        System.out.println("Input customer phone number");
                        String phoneNumber = sc.nextLine();
                        System.out.println("Input customer email");
                        String email = sc.nextLine();
                        System.out.println("Input customer ty of guest");
                        String typeOfGuest = sc.nextLine();
                        System.out.println("Input customer address");
                        String address = sc.nextLine();
                        customerService.add(new Customer(customerId, name, dateOfBirth, gender, identityCard, phoneNumber, email
                                , typeOfGuest, address));
                        break;
                    case 3:
                        System.out.println("Input customer id to edit");
                        String oldCustomerId = sc.nextLine();
                        Customer c = customerService.findByCustomerId(oldCustomerId);
                        if (c != null) {
                            System.out.println("Input customer new name");
                            String newName = sc.nextLine();
                            System.out.println("Input customer new date of birth");
                            String newDateOfBirth = sc.nextLine();
                            System.out.println("Input customer new gender");
                            String newGender = sc.nextLine();
                            System.out.println("Input customer new identity card");
                            String newIdentityCard = sc.nextLine();
                            System.out.println("Input customer new phone number");
                            String newPhoneNumber = sc.nextLine();
                            System.out.println("Input customer new email");
                            String newEmail = sc.nextLine();
                            System.out.println("Input customer new type of guest");
                            String newTypeOfGuest = sc.nextLine();
                            System.out.println("Input customer new address");
                            String newAddress = sc.nextLine();
                            c.setName(newName);
                            c.setDateOfBirth(newDateOfBirth);
                            c.setGender(newGender);
                            c.setIdentityCard(newIdentityCard);
                            c.setPhoneNumber(newPhoneNumber);
                            c.setEmail(newEmail);
                            c.setTypeOfGuest(newTypeOfGuest);
                            c.setAddress(newAddress);
                            customerService.edit(c);
                        } else {
                            System.out.println("Not existed");
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.err.println("Input again: ");
                }
            }catch (NumberFormatException e){
                System.err.println("Input number 1 to 4");
            }
        } while (true);
    }
}
