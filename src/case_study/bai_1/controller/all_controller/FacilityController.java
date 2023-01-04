package case_study.bai_1.controller.all_controller;

import case_study.bai_1.controller.FuramaController;
import case_study.bai_1.model.model_facility.Room;
import case_study.bai_1.model.model_facility.Villa;
import case_study.bai_1.service.all_class_service.FacilityServiceImpl;
import case_study.bai_1.service.all_service_interface.IFacilityService;
import case_study.bai_1.util.Validate;

import java.util.Scanner;

public class FacilityController {
    private static IFacilityService facilityService = new FacilityServiceImpl();

    public static void facilityController() {
        do {
            System.out.println("-------Menu-------");
            System.out.println("1. Display list facility\n"
                    + "2. Add new facility\n"
                    + "3. Display list facility maintenance\n"
                    + "4. Return main menu"
            );
            System.out.println("Please choose menu: ");
            Scanner sc = new Scanner(System.in);
            try {
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
                            try {
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
                                            System.out.println("Input villa id");
                                            vServiceCode = sc.nextLine();
                                        } while (!vServiceCode.matches(Validate.REGEX_SERVICE_CODE_VILLA));
                                        do {
                                            System.out.println("Input service name");
                                            vServiceName = sc.nextLine();
                                        } while (!vServiceName.matches(Validate.REGEX_SERVICE_NAME));
                                        do {
                                            System.out.println("Input usable area");
                                            vUsableArea = sc.nextLine();
                                        } while (!vUsableArea.matches(Validate.REGEX_SERVICE_USABLE_AREA));
                                        do {
                                            System.out.println("Input rental costs");
                                            vRentalCosts = sc.nextLine();
                                        } while (!vRentalCosts.matches(Validate.REGEX_SERVICE_RENTAL_COSTS));
                                        do {
                                            System.out.println("Input max number of people");
                                            vMaxNumberOfPeople = sc.nextLine();
                                        } while (!vMaxNumberOfPeople.matches(Validate.REGEX_SERVICE_MAX_NUMBER_OF_PEOPLE));
                                        do {
                                            System.out.println("Input rental types");
                                            vRentalType = sc.nextLine();
                                        } while (!vRentalType.matches(Validate.REGEX_SERVICE_RENTAL_TYPES));
                                        do {
                                            System.out.println("Input room standard");
                                            roomStandard = sc.nextLine();
                                        } while (!roomStandard.matches(Validate.REGEX_SERVICE_ROOM_STANDARD));
                                        do {
                                            System.out.println("Input swimming pool area");
                                            swimmingPoolArea = sc.nextLine();
                                        } while (!swimmingPoolArea.matches(Validate.REGEX_SERVICE_SWIMMING_POOL_AREA));
                                        do {
                                            System.out.println("Input number of floors");
                                            numberOfFloors = sc.nextLine();
                                        } while (!numberOfFloors.matches(Validate.REGEX_SERVICE_NUMBER_OF_FLOORS));
                                        facilityService.addVilla(new Villa(vServiceCode, vServiceName, vUsableArea, vRentalCosts, vMaxNumberOfPeople,
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
                                            System.out.println("Input villa id");
                                            rServiceCode = sc.nextLine();
                                        } while (!rServiceCode.matches(Validate.REGEX_SERVICE_CODE_ROOM));
                                        do {
                                            System.out.println("Input service name");
                                            rServiceName = sc.nextLine();
                                        } while (!rServiceName.matches(Validate.REGEX_SERVICE_NAME));
                                        do {
                                            System.out.println("Input usable area");
                                            rUsableArea = sc.nextLine();
                                        } while (!rServiceName.matches(Validate.REGEX_SERVICE_USABLE_AREA));
                                        do {
                                            System.out.println("Input rental costs");
                                            rRentalCosts = sc.nextLine();
                                        } while (!rServiceName.matches(Validate.REGEX_SERVICE_RENTAL_COSTS));
                                        do {
                                            System.out.println("Input max number of people");
                                            rMaxNumberOfPeople = sc.nextLine();
                                        } while (!rServiceName.matches(Validate.REGEX_SERVICE_MAX_NUMBER_OF_PEOPLE));
                                        do {
                                            System.out.println("Input rental types");
                                            rRentalType = sc.nextLine();
                                        } while (!rServiceName.matches(Validate.REGEX_SERVICE_RENTAL_TYPES));
                                        System.out.println("Input free service");
                                        String freeService = sc.nextLine();
                                        facilityService.addRoom(new Room(rServiceCode, rServiceName, rUsableArea, rRentalCosts, rMaxNumberOfPeople,
                                                rRentalType, freeService));
                                        break;
                                    case 3:
                                        return;
                                    default:
                                        System.err.println("Input again");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Input number 1 to 3");
                            }
                        } while (true);
                    case 3:
                        facilityService.displayListFacilityMaintenance();
                        break;
                    case 4:
                        return;
                    default:
                        System.err.println("Input again: ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input number 1 to 4");
            }
        } while (true);
    }
}
