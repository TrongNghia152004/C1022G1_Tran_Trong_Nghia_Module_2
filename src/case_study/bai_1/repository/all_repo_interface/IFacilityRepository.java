package case_study.bai_1.repository.all_repo_interface;

import case_study.bai_1.model.model_facility.Room;
import case_study.bai_1.model.model_facility.Villa;
import case_study.bai_1.repository.IRepository;

public interface IFacilityRepository extends IRepository {

    void displayListFacilityMaintenance();
    void addRoom(Room room);
    void addVilla(Villa villa);

}
