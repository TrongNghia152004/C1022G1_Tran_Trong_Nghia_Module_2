package ss17.bai_tap.quan_li_san_pham.service;

import ss17.bai_tap.quan_li_san_pham.model.Product;

public interface IProductService {
    void addProduct(Product product);
    void displayProduct();
    void searchProduct(int codeProduct);

}
