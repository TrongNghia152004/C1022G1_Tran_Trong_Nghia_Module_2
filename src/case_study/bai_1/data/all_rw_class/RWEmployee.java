package case_study.bai_1.data.all_rw_class;

import case_study.bai_1.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWEmployee {
    static final String FILE_PATH = "D:\\Module 2\\baitap\\src\\case_study\\bai_1\\data\\all_file_csv\\employee.csv";

    public static List<Employee> readCSVEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String employeeId = temp[0];
                String name = temp[1];
                String dateOfBirth = temp[2];
                String gender = temp[3];
                String identityCard = temp[4];
                String phoneNumber = temp[5];
                String email = temp[6];
                String level = temp[7];
                String position = temp[8];
                String wage = temp[9];
                employee = new Employee(employeeId,name,dateOfBirth,gender,identityCard,phoneNumber,email,level,position,wage);
                employeeList.add(employee);
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
        return employeeList;
    }
    public static void writeCSVEmployee(List<Employee> employeeList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH , true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e: employeeList) {
                bufferedWriter.write(e.formatCSVEmployee());
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
    public static void writeCSVEmployee2(List<Employee> employeeList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e: employeeList) {
                bufferedWriter.write(e.formatCSVEmployee());
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
