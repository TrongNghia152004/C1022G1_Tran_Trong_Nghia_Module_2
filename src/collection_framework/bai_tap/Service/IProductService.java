package collection_framework.bai_tap.Service;

import collection_framework.bai_tap.Model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    void displayProduct();

    void updateProduct(int id, Product product);

    void removeProduct(int id);

    void searchProduct(String name);

    void sortAscending();

    void sortDescending();
}

