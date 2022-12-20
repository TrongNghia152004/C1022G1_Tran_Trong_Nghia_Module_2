package collection_framework.bai_tap.Controller;

import collection_framework.bai_tap.Model.Product;
import collection_framework.bai_tap.Service.IProductService;
import collection_framework.bai_tap.Service.ProductManager;

import java.util.Scanner;

public class ProductController {
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
        System.out.println("8. Tìm kiếm tên sản phẩm theo tên gần đúng");
        System.out.println("9. Tìm kiếm sản phẩm trong khoảng giá");
        System.out.println("10. Thoát");
        do {
            System.out.println("Chọn số để thực hiện các bước trên");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
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
                    break;
                case 3:
                    System.out.print("Nhập id sản phẩm: ");
                    id = Integer.parseInt(sc.nextLine());
                    productManager.removeProduct(id);
                    break;
                case 4:
                    System.out.println("Nhập id sản phẩm cần sửa: ");
                    int oldId = Integer.parseInt(sc.nextLine());
                    Product c = productManager.findById(oldId);
                    if (c != null) {
                        System.out.print("Nhập tên mới của sản phẩm: ");
                        String newName = sc.nextLine();
                        System.out.print("Nhập giá mới của sản phẩm: ");
                        double newPrice = Integer.parseInt(sc.nextLine());
                        c.setProductName(newName);
                        c.setProductPrice(newPrice);
                    } else {
                        System.out.println("Not existed");
                    }

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
                    System.out.println("Nhập name cần tìm");
                    String findName = sc.nextLine();
                    productManager.findByName(findName);
                    break;
                case 9:
                    System.out.println("Nhập giá thấp nhất bạn muốn tìm");
                    int lowPrice = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập giá cao nhất bạn muốn tìm");
                    int highPrice = Integer.parseInt(sc.nextLine());
                    productManager.searchPriceRange(lowPrice,highPrice);
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Not choice");
            }
        } while (true);
    }
}
