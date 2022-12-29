package case_study.bai_1.repository;

import case_study.bai_1.model.Room;
import case_study.bai_1.model.Villa;

public interface IFacilityRepository extends IRepository {

    void displayListFacilityMaintenance();
    void addRoom(Room room);
    void addVilla(Villa villa);

}
