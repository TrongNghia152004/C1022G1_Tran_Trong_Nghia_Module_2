package case_study.bai_1.data.all_rw_class.read_write_facility;

import case_study.bai_1.model.Facility;
import case_study.bai_1.model.model_facility.Room;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RWRoom {
    static final String FILE_PATH = "D:\\Module 2\\baitap\\src\\case_study\\bai_1\\data\\all_file_csv\\file_facility\\room.csv";
    public static Map<Room, Integer> readCSVRoom(){
        Map<Room, Integer> rMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String []temp;
            Room room;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                String serviceCode = temp[0];
                String serviceName = temp[1];
                String usableArea = temp[2];
                String rentalCosts = temp[3];
                String maxNumberOfPeople = temp[4];
                String rentalType = temp[5];
                String freeService = temp[6];
                room = new Room(serviceCode,serviceName,usableArea,rentalCosts,maxNumberOfPeople,rentalType,freeService);
                rMap.put(room,Integer.parseInt(temp[7]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return rMap;
    }
    public static void writeCSVRoom(Map<Room, Integer> rMap){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room , Integer> entry: rMap.entrySet()) {
                bufferedWriter.write(entry.getKey() + "," + entry.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
