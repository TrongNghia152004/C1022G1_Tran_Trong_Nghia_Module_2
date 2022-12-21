package collection_framework.bai_tap.Service;

import collection_framework.bai_tap.Model.Product;
import collection_framework.bai_tap.Repository.IProductRepository;
import collection_framework.bai_tap.Repository.ProductRepository;

public class ProductService implements IProductService {
    private IProductRepository repository = new ProductRepository();

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void displayProduct() {
        repository.displayProduct();
    }

    @Override
    public void updateProduct(int id, Product product) {
        repository.updateProduct(id, product);
    }

    @Override
    public void removeProduct(int id) {
        repository.removeProduct(id);
    }

    @Override
    public void searchProduct(String name) {
        repository.searchProduct(name);
    }

    @Override
    public void sortAscending() {
        repository.sortAscending();
    }

    @Override
    public void sortDescending() {
        repository.sortDescending();
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void findByName(String name) {
        repository.findByName(name);
    }

    @Override
    public void searchPriceRange(int lowPrice, int highPrice) {
        repository.searchPriceRange(lowPrice,highPrice);
    }
}
