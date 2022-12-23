package ss17.bai_tap.quan_li_san_pham.repository;

import ss17.bai_tap.quan_li_san_pham.model.Product;

public interface IProductRepository {
    void addProduct(Product product);
    void displayProduct();
    void searchProduct(int codeProduct);
}
