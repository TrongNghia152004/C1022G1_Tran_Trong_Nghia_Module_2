package case_study.bai_1.data.all_rw_class.read_write_facility;

import case_study.bai_1.model.model_facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RWVilla {
    static final String FILE_PATH = "D:\\Module 2\\baitap\\src\\case_study\\bai_1\\data\\all_file_csv\\file_facility\\villa.csv";
    public static Map<Villa , Integer> readCSVVilla(){
        Map<Villa, Integer> vMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String []temp;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                String serviceCode = temp[0];
                String serviceName = temp[1];
                String usableArea = temp[2];
                String rentalCosts = temp[3];
                String maxNumberOfPeople = temp[4];
                String rentalType = temp[5];
                String roomStandard = temp[6];
                String swimmingPoolArea = temp[7];
                String numberOfFloors = temp[8];
                villa = new Villa(serviceCode, serviceName , usableArea , rentalCosts ,
                        maxNumberOfPeople , rentalType , roomStandard,
                        swimmingPoolArea,numberOfFloors);
                vMap.put(villa , Integer.parseInt(temp[9]));
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
        return vMap;
    }
    public static void writeCSVVilla(Map<Villa, Integer> vMap){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa , Integer> entry: vMap.entrySet()) {
                bufferedWriter.write(entry.getKey().formatCSVVilla() + "," + entry.getValue());
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
    public static void writeCSVVilla2(Map<Villa, Integer> vMap){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa , Integer> entry: vMap.entrySet()) {
                bufferedWriter.write(entry.getKey().formatCSVVilla() + "," + entry.getValue());
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
