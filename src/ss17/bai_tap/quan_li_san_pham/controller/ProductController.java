package ss17.bai_tap.quan_li_san_pham.controller;

import ss17.bai_tap.quan_li_san_pham.model.Product;
import ss17.bai_tap.quan_li_san_pham.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static ProductService productService = new ProductService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------MENU-------\n"
                + "1. Thêm sản phẩm\n"
                + "2. Hiển thị sản phẩm\n"
                + "3. Tìm kiếm thông tin sản phẩm");
        do {
            System.out.println("Mời bạn chọn menu:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập mã sản phẩm");
                    int code = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm:");
                    String name = sc.nextLine();
                    System.out.println("Nhập hãng sản xuất:");
                    String manufacturer = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm:");
                    int price = Integer.parseInt(sc.nextLine());
                    productService.addProduct(new Product(code, name, manufacturer, price));
                    break;
                case 2:
                    productService.displayProduct();
                    break;
                case 3:
                    System.out.println("Nhập mã sản phẩm bạn muốn tìm:");
                    int findCode = Integer.parseInt(sc.nextLine());
                    productService.searchProduct(findCode);
                    break;
                default:
                    System.err.println("Mời bạn nhập lại: ");
            }
        } while (true);

    }

}
