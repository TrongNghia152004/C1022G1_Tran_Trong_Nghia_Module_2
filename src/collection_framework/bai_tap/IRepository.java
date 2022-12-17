package collection_framework.bai_tap;

public interface IRepository {
    Product[] findAll();

    void addProduct(Product product);

    void deleteProduct(Product product);

    void sortProduct(Product product);
}
