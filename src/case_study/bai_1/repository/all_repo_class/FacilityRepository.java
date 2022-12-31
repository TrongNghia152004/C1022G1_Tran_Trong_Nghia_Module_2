package case_study.bai_1.repository.all_repo_class;

import case_study.bai_1.data.all_rw_class.read_write_facility.RWRoom;
import case_study.bai_1.data.all_rw_class.read_write_facility.RWVilla;
import case_study.bai_1.model.Facility;
import case_study.bai_1.model.model_facility.Room;
import case_study.bai_1.model.model_facility.Villa;
import case_study.bai_1.repository.all_repo_interface.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Facility , Integer> facilityMap = new LinkedHashMap<>();
//    static {
//        facilityMap.put(new Room("SVRO-1","Room1","32.0","5000000",
//                "10","7 day","buffer"),2);
//        facilityMap.put(new Room("SVRO-2","Room2","16.0","2000000",
//                "3","7 day","buffer"),2);
//        facilityMap.put(new Room("SVRO-3","Room3","24.0","3000000",
//                "5","7 day","buffer"),5);
//        facilityMap.put(new Villa("SVVL-1","Villa1", "32.0","5000000","10","7 day",
//                "Suite","60.0","5"),2);
//        facilityMap.put(new Villa("SVVL-2","Villa2", "16.0","2000000","3","7 day",
//                "Deluxe","50.0","3"),3);
//        facilityMap.put(new Villa("SVVL-3","Villa3", "24.0","3000000","5","7 day",
//                "Superior","40.0","4"),5);
//    }

    @Override
    public void display() {
        Map<Room , Integer> rMap = RWRoom.readCSVRoom();
        facilityMap.putAll(rMap);
        Map<Villa, Integer> vMap = RWVilla.readCSVVilla();
        facilityMap.putAll(vMap);
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
        Map<Room , Integer> rMap = RWRoom.readCSVRoom();
        facilityMap.put(room , 0);
        RWRoom.writeCSVRoom(rMap);
    }

    @Override
    public void addVilla(Villa villa) {
        Map<Villa, Integer> vMap = RWVilla.readCSVVilla();
        facilityMap.put(villa,0);
        RWVilla.writeCSVVilla(vMap);
    }
}
