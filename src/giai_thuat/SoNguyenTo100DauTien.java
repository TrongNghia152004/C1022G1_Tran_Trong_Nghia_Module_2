package giai_thuat;

import java.util.Scanner;

public class SoNguyenTo100DauTien {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2 ; i <= 100 ; i++){
            count = 0;
            for (int j = 1; j < i ; j++) {
                if ( i % j == 0){
                    count++;
                }
            }

        }
    }
}
