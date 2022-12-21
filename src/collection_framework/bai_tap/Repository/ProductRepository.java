package collection_framework.bai_tap.Repository;

import collection_framework.bai_tap.Model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static List<Product> productList = new ArrayList<>();
 static {
     productList.add(new Product(1, "Thuốc cảm", 25000));
     productList.add(new Product(2, "Thuốc sốt", 30000));
     productList.add(new Product(3, "Thuốc ho", 50000));
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
    public void updateProduct(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(id).getId() == product.getId()) {
                productList.set(i, product);
                break;
            }
        }
    }

    @Override
    public void removeProduct(int id) {

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public void searchProduct(String name) {
        for (Product product : productList) {
            if (product.getProductName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void sortAscending() {
        Collections.sort(productList);
        Collections.reverse(productList);
    }

    @Override
    public void sortDescending() {
        Collections.sort(productList);
    }



    @Override
    public Product findById(int id) {
        for (Product c : productList) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void findByName(String name) {
        for (Product product: productList) {
            if (product.getProductName().contains(name)){
                System.out.println(product);
            }
        }
    }

    @Override
    public void searchPriceRange(int lowPrice, int highPrice) {
        for (Product product : productList) {
            if (product.getProductPrice() >= lowPrice && product.getProductPrice() <= highPrice){
                System.out.println(product);
            }
        }
    }


}
