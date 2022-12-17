package collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagerModel {
ArrayList<Product> listProduct = new ArrayList<>();
public void inputList(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập số lượng sản phẩm");
    int amount = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < amount ; i++) {
        Product product = new Product();
        product.inputInformation();
        listProduct.add(product);
    }
}
public void outputList(){
    for (Product product : listProduct) {
    product.outputInformation();
        System.out.println("\n");
    }
}
public void findProduct(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập mã sản phẩm cần tìm: ");

}
}
