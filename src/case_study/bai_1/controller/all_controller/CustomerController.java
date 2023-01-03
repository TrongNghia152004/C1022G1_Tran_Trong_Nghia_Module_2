package case_study.bai_1.controller.all_controller;

import case_study.bai_1.controller.FuramaController;
import case_study.bai_1.model.Customer;
import case_study.bai_1.service.all_class_service.CustomerServiceImpl;
import case_study.bai_1.service.all_service_interface.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    private static ICustomerService customerService = new CustomerServiceImpl();

    public static void customerController() {
        System.out.println("Mời bạn chọn menu: ");
        System.out.println("1. Display list customer\n"
                + "2. Add new customer\n"
                + "3. Edit customer\n"
                + "4. Return main menu"
        );
        do {
            System.out.println("Mời bạn nhập menu: ");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    System.out.println("Nhập id của khách hàng");
                    String customerId = sc.nextLine();
                    System.out.println("Nhập tên khách hàng");
                    String name = sc.nextLine();
                    System.out.println("Nhập ngày sinh khách hàng");
                    String dateOfBirth = sc.nextLine();
                    System.out.println("Nhập giới tính khách hàng");
                    String gender = sc.nextLine();
                    System.out.println("Nhập CMND khách hàng");
                    String identityCard = sc.nextLine();
                    System.out.println("Nhập SĐT khách hàng");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Nhập email khách hàng");
                    String email = sc.nextLine();
                    System.out.println("Nhập loại khách hàng");
                    String typeOfGuest = sc.nextLine();
                    System.out.println("Nhập địa chỉ khách hàng");
                    String address = sc.nextLine();
                    customerService.add(new Customer(customerId, name, dateOfBirth, gender, identityCard, phoneNumber, email
                            , typeOfGuest, address));
                    break;
                case 3:
                    System.out.println("Nhập id khách hàng cần sửa");
                    String oldCustomerId = sc.nextLine();
                    Customer c = customerService.findByCustomerId(oldCustomerId);
                    if (c != null) {
                        System.out.println("Nhập tên khách hàng");
                        String newName = sc.nextLine();
                        System.out.println("Nhập ngày sinh khách hàng");
                        String newDateOfBirth = sc.nextLine();
                        System.out.println("Nhập giới tính khách hàng");
                        String newGender = sc.nextLine();
                        System.out.println("Nhập CMND khách hàng");
                        String newIdentityCard = sc.nextLine();
                        System.out.println("Nhập SĐT khách hàng");
                        String newPhoneNumber = sc.nextLine();
                        System.out.println("Nhập email khách hàng");
                        String newEmail = sc.nextLine();
                        System.out.println("Nhập loại khách hàng");
                        String newTypeOfGuest = sc.nextLine();
                        System.out.println("Nhập địa chỉ khách hàng");
                        String newAddress = sc.nextLine();
                        c.setName(newName);
                        c.setDateOfBirth(newDateOfBirth);
                        c.setGender(newGender);
                        c.setIdentityCard(newIdentityCard);
                        c.setPhoneNumber(newPhoneNumber);
                        c.setEmail(newEmail);
                        c.setTypeOfGuest(newTypeOfGuest);
                        c.setAddress(newAddress);
                    } else {
                        System.out.println("Not existed");
                    }
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.err.println("Mời bạn nhập lại: ");
            }
        } while (true);
    }
}
