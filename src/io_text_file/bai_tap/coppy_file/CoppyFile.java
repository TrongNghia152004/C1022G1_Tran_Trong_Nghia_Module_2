package io_text_file.bai_tap.coppy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoppyFile {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        String line;
        int sum = 0;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                sum += line.length();
                list.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        System.out.println("Tổng số kí tự có trong file: " + sum);
        return list;
    }

    public static File writeFile(String path, List<String> list) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String character : list) {
                bufferedWriter.write(character);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return null;
    }

    public static void main(String[] args) {
        String sourcePath = "D:\\Module 2\\baitap\\src\\io_text_file\\bai_tap\\coppy_file\\source_file.csv";
        String targetPath = "D:\\Module 2\\baitap\\src\\io_text_file\\bai_tap\\coppy_file\\target_file.csv";
        CoppyFile.writeFile(targetPath, CoppyFile.readFile(sourcePath));
    }

}
