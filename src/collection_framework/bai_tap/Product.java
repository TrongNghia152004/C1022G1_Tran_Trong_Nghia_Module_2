package collection_framework.bai_tap;

import java.util.Scanner;

public class Product {
private String productName;
private double productPrice;

    public Product() {
    }

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public void inputInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm");
        productName = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        productPrice = Double.parseDouble(sc.nextLine());
    }
    public void outputInformation(){
        System.out.println(this.productName + " - " + this.productPrice);
    }
}
