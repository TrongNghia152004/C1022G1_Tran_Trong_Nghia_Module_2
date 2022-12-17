package collection_framework.bai_tap.Model;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Product implements Comparable<Product> {
    private int id;
    private String productName;
    private double productPrice;

    public Product() {
    }

    public Product(int id, String productName, double productPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public int compareTo(@NotNull Product o) {
        return (int) (o.productPrice - this.productPrice);
    }
}
