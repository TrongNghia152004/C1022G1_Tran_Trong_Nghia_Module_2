package ss17.bai_tap.quan_li_san_pham.service;

import ss17.bai_tap.quan_li_san_pham.model.Product;
import ss17.bai_tap.quan_li_san_pham.repository.IProductRepository;
import ss17.bai_tap.quan_li_san_pham.repository.ProductRepository;

public class ProductService implements IProductService {
    IProductRepository repository = new ProductRepository();
    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void displayProduct() {
        repository.displayProduct();
    }

    @Override
    public void searchProduct(int codeProduct) {
        repository.searchProduct(codeProduct);
    }
}
