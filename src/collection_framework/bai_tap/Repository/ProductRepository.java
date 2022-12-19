package collection_framework.bai_tap.Repository;

import collection_framework.bai_tap.Model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    public static List<Product> productList = new ArrayList<>();

    Product product1 = new Product(1, "Quần dài", 250000);
    Product product3 = new Product(3, "Áo khoác", 500000);
    Product product2 = new Product(2, "Thuốc sốt", 30000);

    public ProductRepository() {
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }


    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void displayProduct() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    @Override
    public void removeProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId()==id) {
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public void searchProduct(String name) {
        for (Product product : productList) {
            if(product.getProductName().equals(name)){
                System.out.println(product);
            }
        }
    }

    @Override
    public void sortAscending() {
        Collections.sort(productList);
    }

    @Override
    public void sortDescending() {
        Collections.sort(productList);
        Collections.reverse(productList);

    }

    @Override
    public void updateProduct(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(productList.indexOf(productList.get(i)), product);
            }
        }

    }
}
