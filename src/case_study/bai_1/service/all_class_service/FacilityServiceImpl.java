package case_study.bai_1.service.all_class_service;

import case_study.bai_1.model.model_facility.Room;
import case_study.bai_1.model.model_facility.Villa;
import case_study.bai_1.repository.all_repo_class.FacilityRepository;
import case_study.bai_1.repository.all_repo_interface.IFacilityRepository;
import case_study.bai_1.service.all_service_interface.IFacilityService;

public class FacilityServiceImpl implements IFacilityService {
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void displayListFacilityMaintenance() {
        facilityRepository.displayListFacilityMaintenance();
    }

    @Override
    public void addRoom(Room room) {
        facilityRepository.addRoom(room);
    }

    @Override
    public void addVilla(Villa villa) {
        facilityRepository.addVilla(villa);
    }

    @Override
    public void display() {
        facilityRepository.display();
    }

    @Override
    public void add(Object object) {
        facilityRepository.add(object);
    }
}
