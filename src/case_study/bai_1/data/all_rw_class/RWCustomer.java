package case_study.bai_1.data.all_rw_class;

import case_study.bai_1.model.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class RWCustomer {
    static final String FILE_PATH = "D:\\Module 2\\baitap\\src\\case_study\\bai_1\\data\\all_file_csv\\customer.csv";
    public static List<Customer> readCSVCustomer(){
        List<Customer> customerList = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String []temp;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                String customerId = temp[0];
                String name = temp[1];
                String dateOfBirth = temp[2];
                String gender = temp[3];
                String identityCard = temp[4];
                String phoneNumber = temp[5];
                String email = temp[6];
                String typeOfGuest = temp[7];
                String address = temp[8];
                customer = new Customer(customerId,name,dateOfBirth,gender,identityCard,phoneNumber,email,typeOfGuest,address);
                customerList.add(customer);
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
        return customerList;
    }
    public static void writeCSVCustomer(List<Customer> customerList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer c: customerList) {
                bufferedWriter.write(c.formatCustomer());
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
