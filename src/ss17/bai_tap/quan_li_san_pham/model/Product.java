package ss17.bai_tap.quan_li_san_pham.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 2L;
    private int codeProduct;
    private String nameProduct;
    private String manufacturer;
    private int price;

    public Product() {
    }

    public Product(int codeProduct, String nameProduct, String manufacturer, int price) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct=" + this.codeProduct +
                ", nameProduct='" + this.nameProduct + '\'' +
                ", manufacturer='" + this.manufacturer + '\'' +
                ", price=" + this.price +
                '}';
    }
}
