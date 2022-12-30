package case_study.bai_1.controller.all_controller;

import case_study.bai_1.controller.FuramaController;
import case_study.bai_1.model.Room;
import case_study.bai_1.model.Villa;
import case_study.bai_1.service.all_class_service.FacilityServiceImpl;
import case_study.bai_1.service.all_service_interface.IFacilityService;
import case_study.bai_1.util.Validate;

import java.util.Scanner;

public class FacilityController {
    private static IFacilityService facilityService = new FacilityServiceImpl();

    public static void facilityController() {
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
            switch (choice) {
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
                        switch (choose) {
                            case 1:
                                String vServiceCode;
                                String vServiceName;
                                String vUsableArea;
                                String vRentalCosts;
                                String vMaxNumberOfPeople;
                                String vRentalType;
                                String roomStandard;
                                String swimmingPoolArea;
                                String numberOfFloors;
                                do {
                                    System.out.println("Nhập mã villa");
                                    vServiceCode = sc.nextLine();
                                }while (!vServiceCode.matches(Validate.REGEX_SERVICE_CODE_VILLA));
                                do {
                                    System.out.println("Nhập tên dịch vụ");
                                    vServiceName = sc.nextLine();
                                } while (!vServiceName.matches(Validate.REGEX_SERVICE_NAME));
                                do {
                                    System.out.println("Nhập diện tích sử dụng");
                                    vUsableArea = sc.nextLine();
                                }while (!vUsableArea.matches(Validate.REGEX_SERVICE_USABLE_AREA));
                                do {
                                    System.out.println("Nhập chi phí thuê");
                                    vRentalCosts = sc.nextLine();
                                }while (!vRentalCosts.matches(Validate.REGEX_SERVICE_RENTAL_COSTS));
                                do {
                                    System.out.println("Nhập số lượng người tối đa");
                                    vMaxNumberOfPeople = sc.nextLine();
                                }while (!vMaxNumberOfPeople.matches(Validate.REGEX_SERVICE_MAX_NUMBER_OF_PEOPLE));
                                do {
                                    System.out.println("Nhập kiểu thuê");
                                    vRentalType = sc.nextLine();
                                }while (!vRentalType.matches(Validate.REGEX_SERVICE_RENTAL_TYPES));
                                do {
                                    System.out.println("Nhập tiêu chuẩn phòng");
                                    roomStandard = sc.nextLine();
                                }while (!roomStandard.matches(Validate.REGEX_SERVICE_ROOM_STANDARD));
                                do {
                                    System.out.println("Nhập diện tích hồ bơi");
                                    swimmingPoolArea = sc.nextLine();
                                }while (!swimmingPoolArea.matches(Validate.REGEX_SERVICE_SWIMMING_POOL_AREA));
                                do {
                                    System.out.println("Nhập số tầng");
                                    numberOfFloors = sc.nextLine();
                                }while (!numberOfFloors.matches(Validate.REGEX_SERVICE_NUMBER_OF_FLOORS));
                                facilityService.addVilla(new Villa(vServiceCode,vServiceName, vUsableArea, vRentalCosts, vMaxNumberOfPeople,
                                        vRentalType, roomStandard, swimmingPoolArea, numberOfFloors));
                                break;
                            case 2:
                                String rServiceCode;
                                String rServiceName;
                                String rUsableArea;
                                String rRentalCosts;
                                String rMaxNumberOfPeople;
                                String rRentalType;
                                do {
                                    System.out.println("Nhập mã room");
                                    rServiceCode = sc.nextLine();
                                }while (!rServiceCode.matches(Validate.REGEX_SERVICE_CODE_ROOM));
                                do {
                                    System.out.println("Nhập tên dịch vụ");
                                    rServiceName = sc.nextLine();
                                }while (!rServiceName.matches(Validate.REGEX_SERVICE_NAME));
                                do {
                                    System.out.println("Nhập diện tích sử dụng");
                                    rUsableArea = sc.nextLine();
                                }while (!rServiceName.matches(Validate.REGEX_SERVICE_USABLE_AREA));
                               do {
                                   System.out.println("Nhập chi phí thuê");
                                   rRentalCosts = sc.nextLine();
                               }while (!rServiceName.matches(Validate.REGEX_SERVICE_RENTAL_COSTS));
                                do {
                                    System.out.println("Nhập số lượng người tối đa");
                                    rMaxNumberOfPeople = sc.nextLine();
                                }while (!rServiceName.matches(Validate.REGEX_SERVICE_MAX_NUMBER_OF_PEOPLE));
                              do {
                                  System.out.println("Nhập kiểu thuê");
                                  rRentalType = sc.nextLine();
                              }while (!rServiceName.matches(Validate.REGEX_SERVICE_RENTAL_TYPES));
                                System.out.println("Nhập dịch vụ miễn phí đi kèm");
                                String freeService = sc.nextLine();
                                facilityService.addRoom(new Room(rServiceCode,rServiceName, rUsableArea, rRentalCosts, rMaxNumberOfPeople,
                                        rRentalType, freeService));
                                break;
                            case 3:
                                FacilityController.facilityController();
                                break;
                            default:
                                System.err.println("Nhập lại");
                        }
                    } while (true);
                case 3:
                    facilityService.displayListFacilityMaintenance();
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
