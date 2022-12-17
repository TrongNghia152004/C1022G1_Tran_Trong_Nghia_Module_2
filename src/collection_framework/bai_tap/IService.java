package collection_framework.bai_tap;

public interface IService {
    Product[] findAll();

    void addProduct(Product product);

    void deleteProduct(Product product);

    void sortProduct(Product product);


}
