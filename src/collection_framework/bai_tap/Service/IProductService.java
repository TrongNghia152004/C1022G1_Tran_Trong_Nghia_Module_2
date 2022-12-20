package collection_framework.bai_tap.Service;

import collection_framework.bai_tap.Model.Product;

public interface IProductService {
    void addProduct(Product product);

    void displayProduct();

    void updateProduct(int id, Product product);

    void removeProduct(int id);

    void searchProduct(String name);

    void sortAscending();

    void sortDescending();

    Product findById(int id);

    void findByName(String name);

    void searchPriceRange(int lowPrice , int highPrice);
}

