package case_study.bai_1.controller.all_controller;

import case_study.bai_1.controller.FuramaController;
import case_study.bai_1.model.Employee;
import case_study.bai_1.service.all_class_service.EmployeeServiceImpl;
import case_study.bai_1.service.all_service_interface.IEmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static IEmployeeService employeeService = new EmployeeServiceImpl();

    public static void employeeController() {
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
            switch (choice) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    System.out.println("Nhập id nhân viên");
                    String employeeID = sc.nextLine();
                    System.out.println("Nhập tên nhân viên");
                    String name = sc.nextLine();
                    System.out.println("Nhập ngày sinh nhân viên");
                    String dateOfBirth = sc.nextLine();
                    System.out.println("Nhập giới tính nhân viên");
                    String gender = sc.nextLine();
                    System.out.println("Nhập CMND nhân viên");
                    String identityCard = sc.nextLine();
                    System.out.println("Nhập SĐT nhân viên");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Nhập email nhân viên");
                    String email = sc.nextLine();
                    System.out.println("Nhập trình độ nhân viên");
                    String level = sc.nextLine();
                    System.out.println("Nhập chức vụ nhân viên");
                    String position = sc.nextLine();
                    System.out.println("Nhập lương nhân viên");
                    String wage = sc.nextLine();
                    employeeService.add(new Employee(employeeID, name, dateOfBirth, gender, identityCard, phoneNumber, email, level, position, wage));
                    break;
                case 3:
                    System.out.println("Nhập id nhân viên");
                    String deleteEmployeeID = sc.nextLine();
                    employeeService.delete(deleteEmployeeID);
                    break;
                case 4:
                    System.out.println("Nhập id nhân viên cần sửa");
                    String oldEmployeeId = sc.nextLine();
                    Employee e = employeeService.findById(oldEmployeeId);
                    if (e != null) {
                        System.out.println("Nhập tên nhân viên");
                        String newName = sc.nextLine();
                        System.out.println("Nhập ngày sinh nhân viên");
                        String newDateOfBirth = sc.nextLine();
                        System.out.println("Nhập giới tính nhân viên");
                        String newGender = sc.nextLine();
                        System.out.println("Nhập CMND nhân viên");
                        String newIdentityCard = sc.nextLine();
                        System.out.println("Nhập SĐT nhân viên");
                        String newPhoneNumber = sc.nextLine();
                        System.out.println("Nhập email nhân viên");
                        String newEmail = sc.nextLine();
                        System.out.println("Nhập trình độ nhân viên");
                        String newLevel = sc.nextLine();
                        System.out.println("Nhập chức vụ nhân viên");
                        String newPosition = sc.nextLine();
                        System.out.println("Nhập lương nhân viên");
                        String newWage = sc.nextLine();
                        e.setName(newName);
                        e.setDateOfBirth(newDateOfBirth);
                        e.setGender(newGender);
                        e.setIdentityCard(newIdentityCard);
                        e.setPhoneNumber(newPhoneNumber);
                        e.setEmail(newEmail);
                        e.setLevel(newLevel);
                        e.setPosition(newPosition);
                        e.setWage(newWage);
                    } else {
                        System.out.println("Not existed");
                    }
                    break;
                case 5:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.err.println("Mời bạn nhập lại: ");
            }
        } while (true);
    }
}
