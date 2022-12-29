package case_study.bai_1.controller.all_controller;

import case_study.bai_1.controller.FuramaController;
import case_study.bai_1.model.Room;
import case_study.bai_1.model.Villa;
import case_study.bai_1.service.all_class_service.FacilityServiceImpl;
import case_study.bai_1.service.all_service_interface.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    private static IFacilityService facilityService = new FacilityServiceImpl();
    public static void facilityController(){
        System.out.println("Mời bạn chọn menu: ");
        System.out.println("1. Display list facility\n"
                + "2. Add new facility\n"
                + "3. Display list facility maintenance\n"
                + "4. Return main menu"
        );
        do {
            System.out.println("Mời bạn nhập menu: ");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    do {
                        System.out.println("-----Menu-----\n" +
                                "1. Add New Villa\n" +
                                "2. Add New Room\n" +
                                "3. Back to menu");
                        int choose = Integer.parseInt(sc.nextLine());
                        switch (choose){
                            case 1:
                                System.out.println("Nhập tên dịch vụ");
                                String vServiceName = sc.nextLine();
                                System.out.println("Nhập diện tích sử dụng");
                                String vUsableArea = sc.nextLine();
                                System.out.println("Nhập chi phí thuê");
                                String vRentalCosts = sc.nextLine();
                                System.out.println("Nhập số lượng người tối đa");
                                String vMaxNumberOfPeople = sc.nextLine();
                                System.out.println("Nhập kiểu thuê");
                                String vRentalType = sc.nextLine();
                                System.out.println("Nhập tiêu chuẩn phòng");
                                String roomStandard = sc.nextLine();
                                System.out.println("Nhập diện tích hồ bơi");
                                String swimmingPoolArea = sc.nextLine();
                                System.out.println("Nhập số tầng");
                                String numberOfFloors = sc.nextLine();
                               facilityService.addVilla(new Villa(vServiceName,vUsableArea,vRentalCosts,vMaxNumberOfPeople,
                                       vRentalType,roomStandard,swimmingPoolArea,numberOfFloors));
                                break;
                            case 2:
                                System.out.println("Nhập tên dịch vụ");
                                String rServiceName = sc.nextLine();
                                System.out.println("Nhập diện tích sử dụng");
                                String rUsableArea = sc.nextLine();
                                System.out.println("Nhập chi phí thuê");
                                String rRentalCosts = sc.nextLine();
                                System.out.println("Nhập số lượng người tối đa");
                                String rMaxNumberOfPeople = sc.nextLine();
                                System.out.println("Nhập kiểu thuê");
                                String rRentalType = sc.nextLine();
                                System.out.println("Nhập dịch vụ miễn phí đi kèm");
                                String freeService = sc.nextLine();
                                facilityService.addRoom(new Room(rServiceName,rUsableArea,rRentalCosts,rMaxNumberOfPeople,
                                        rRentalType,freeService));
                                break;
                            case 3:
                                FacilityController.facilityController();
                                break;
                            default:
                                System.err.println("Nhập lại");
                        }
                    }while (true);
                case 3:
                    facilityService.displayListFacilityMaintenance();
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
