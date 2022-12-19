package collection_framework.bai_tap.Controller;

import collection_framework.bai_tap.Model.Product;
import collection_framework.bai_tap.Service.IProductService;
import collection_framework.bai_tap.Service.ProductManager;

import java.util.Scanner;

public class Test {
    private static IProductService productManager = new ProductManager();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Quản Lí Sản Phẩm-----");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị danh sách sản phẩm");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("4. Sửa thông tin sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm tăng dần");
        System.out.println("7. Sắp xếp sản phẩm giảm dần");
        System.out.println("8. Thoát");
        System.out.println("Chọn số để thực hiện các bước trên");
        do {
            int selection = Integer.parseInt(sc.nextLine());
            switch (selection) {
                case 1:
                    System.out.print("Nhâp id sản phẩm: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    int price = Integer.parseInt(sc.nextLine());
                    productManager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    productManager.displayProduct();
                case 3:
                    System.out.print("Nhập id sản phẩm: ");
                    id = Integer.parseInt(sc.nextLine());
                    productManager.removeProduct(id);
                    break;
                case 4:
                    System.out.print("Nhập id sản phẩm cấn sửa: ");
                    int fixId = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập id mới của sản phẩm: ");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên mới của sản phẩm: ");
                    name = sc.nextLine();
                    System.out.print("Nhập giá mới của sản phẩm: ");
                    price = Integer.parseInt(sc.nextLine());
                    productManager.updateProduct(fixId, new Product(id, name, price));
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm: ");
                    name = sc.nextLine();
                    productManager.searchProduct(name);
                    break;
                case 6:
                    productManager.sortAscending();
                    break;
                case 7:
                    productManager.sortDescending();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
