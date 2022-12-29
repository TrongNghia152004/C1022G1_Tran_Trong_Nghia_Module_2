package case_study.bai_1.repository;

import case_study.bai_1.controller.all_controller.FacilityController;
import case_study.bai_1.model.Facility;
import case_study.bai_1.model.Room;
import case_study.bai_1.model.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityRepository implements IFacilityRepository{
    private static Map<Facility , Integer> facilityMap = new LinkedHashMap<>();
    static {
        facilityMap.put(new Room("Room1","32.0","5000000",
                "10","7 day","buffer"),2);
        facilityMap.put(new Room("Room2","16.0","2000000",
                "3","7 day","buffer"),2);
        facilityMap.put(new Room("Room3","24.0","3000000",
                "5","7 day","buffer"),5);
        facilityMap.put(new Villa("Villa1", "32.0","5000000","10","7 day",
                "Suite","60.0","5"),2);
        facilityMap.put(new Villa("Villa2", "16.0","2000000","3","7 day",
                "Deluxe","50.0","3"),3);
        facilityMap.put(new Villa("Villa3", "24.0","3000000","5","7 day",
                "Superior","40.0","4"),5);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> entry: facilityMap.entrySet()) {
                System.out.println(entry.getKey() + "số lần sử dụng: " + entry.getValue());
            }
    }

    @Override
    public void add(Object object) {
    }

    @Override
    public void displayListFacilityMaintenance() {
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getValue() >= 5){
                System.out.println(entry.getKey() + "cần bảo trì");
            }
        }
    }

    @Override
    public void addRoom(Room room) {
        facilityMap.put(room , 0);
    }

    @Override
    public void addVilla(Villa villa) {
        facilityMap.put(villa,0);
    }
}
