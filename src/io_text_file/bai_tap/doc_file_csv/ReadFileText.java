package io_text_file.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileText {

    public static List<Nation> readCSV() {
        List<Nation> nationList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("D:\\Module 2\\baitap\\src\\io_text_file\\bai_tap\\doc_file.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] arr;
            Nation nation;
            while ((line = bufferedReader.readLine()) != null){
                arr = line.split(",");
                int id = Integer.parseInt(arr[0]);
                String code = arr[1];
                String name = arr[2];
                nation = new Nation(id,code,name);
                nationList.add(nation);
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException();
        }
        catch (IOException e) {
            throw new RuntimeException();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return nationList;
    }

    public static void main(String[] args) {
        List<Nation> nationList = readCSV();
        for (Nation nation : nationList) {
            System.out.println(nation);
        }
    }
}
