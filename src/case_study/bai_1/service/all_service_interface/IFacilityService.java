package case_study.bai_1.service.all_service_interface;

import case_study.bai_1.model.model_facility.Room;
import case_study.bai_1.model.model_facility.Villa;
import case_study.bai_1.service.IService;

public interface IFacilityService extends IService {
    void displayListFacilityMaintenance();
    void addRoom(Room room);
    void addVilla(Villa villa);
}
