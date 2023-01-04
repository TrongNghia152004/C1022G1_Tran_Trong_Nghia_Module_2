package case_study.bai_1.controller.all_controller;

import case_study.bai_1.controller.FuramaController;
import case_study.bai_1.model.Employee;
import case_study.bai_1.service.all_class_service.EmployeeServiceImpl;
import case_study.bai_1.service.all_service_interface.IEmployeeService;
import case_study.bai_1.util.NotFoundException;

import java.util.Scanner;

public class EmployeeController {
    private static IEmployeeService employeeService = new EmployeeServiceImpl();

    public static void employeeController(){
        do {
            System.out.println("-------Menu-------: ");
            System.out.println("1. Display list employees\n"
                    + "2. Add new employee\n"
                    + "3. Delete employee\n"
                    + "4. Edit employee\n"
                    + "5. Return main menu\n"
            );
            System.out.println("Please choose menu: ");
            Scanner sc = new Scanner(System.in);
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                            System.out.println("Input employee id");
                            String employeeID = sc.nextLine();
                            System.out.println("Input employee name");
                            String name = sc.nextLine();
                            System.out.println("Input employee date of birth");
                            String dateOfBirth = sc.nextLine();
                            System.out.println("Input employee gender");
                            String gender = sc.nextLine();
                            System.out.println("Input employee identity card");
                            String identityCard = sc.nextLine();
                            System.out.println("Input employee phone number");
                            String phoneNumber = sc.nextLine();
                            System.out.println("Input employee email");
                            String email = sc.nextLine();
                            System.out.println("Input employee level");
                            String level = sc.nextLine();
                            System.out.println("Input employee position");
                            String position = sc.nextLine();
                            System.out.println("Input employee wage");
                            String wage = sc.nextLine();
                            employeeService.add(new Employee(employeeID, name, dateOfBirth, gender, identityCard, phoneNumber, email, level, position, wage));
                        break;
                    case 3:
                        String deleteEmployeeID;
                        do {
                            System.out.println("Input the employee id to delete");
                            deleteEmployeeID = sc.nextLine();
                            if (employeeService.findById(deleteEmployeeID) != null){
                                employeeService.delete(deleteEmployeeID);
                                break;
                            }else {
                                try {
                                    throw new NotFoundException("NotFoundException");
                                }catch (NotFoundException e){
                                    System.err.println(e.getMessage());
                                }
                            }
                        }while (employeeService.findById(deleteEmployeeID) == null);
                        break;
                    case 4:
                        System.out.println("Input id employee to edit");
                        String oldEmployeeId = sc.nextLine();
                        Employee e = employeeService.findById(oldEmployeeId);
                        if (e != null) {
                            System.out.println("Input employee new name");
                            String newName = sc.nextLine();
                            System.out.println("Input employee new date of birth");
                            String newDateOfBirth = sc.nextLine();
                            System.out.println("Input employee new gender");
                            String newGender = sc.nextLine();
                            System.out.println("Input employee new identity card");
                            String newIdentityCard = sc.nextLine();
                            System.out.println("Input employee new phone number");
                            String newPhoneNumber = sc.nextLine();
                            System.out.println("Input employee new email");
                            String newEmail = sc.nextLine();
                            System.out.println("Input employee new level");
                            String newLevel = sc.nextLine();
                            System.out.println("Input employee new position");
                            String newPosition = sc.nextLine();
                            System.out.println("Input employee new wage");
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
                            employeeService.edit(e);
                        } else {
                            System.out.println("Not existed");
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.err.println("Input again: ");
                }
            }catch (NumberFormatException e){
                System.out.println("Input number");
            }
        } while (true);
    }
}
