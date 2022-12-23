package ss17.bai_tap.quan_li_san_pham.repository;

import ss17.bai_tap.quan_li_san_pham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static void writeProduct(List<Product> productList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("D:\\Module 2\\baitap\\src\\ss17\\bai_tap\\quan_li_san_pham\\file\\product.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
    }

    public static List<Product> readProduct(List<Product> productList) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        productList = null;
        try {
            fis = new FileInputStream("D:\\Module 2\\baitap\\src\\ss17\\bai_tap\\quan_li_san_pham\\file\\product.dat");
            ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return productList;
    }

    public static List<Product> productList = new ArrayList<>();
    @Override
    public void addProduct(Product product) {
        productList.add(product);
        writeProduct(productList);
    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct(int codeProduct) {
        for (Product product : productList) {
            if (product.getCodeProduct() == codeProduct) {
                System.out.println(product);
            }
        }
    }
}
