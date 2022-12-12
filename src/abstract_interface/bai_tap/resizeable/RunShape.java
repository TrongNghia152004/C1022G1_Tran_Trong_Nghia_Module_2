package abstract_interface.bai_tap.resizeable;

import java.util.Arrays;

public class RunShape {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", 10);
        shapes[1] = new Rectangle("green", 10, 5);
        shapes[2] = new Square("red", 5);
        System.out.println("Trước khi thay đổi");
        System.out.println(Arrays.toString(shapes));
        System.out.println("Sau khi thay đổi");
        shapes[0].resize(Math.random() * 100);
        shapes[1].resize(Math.random() * 100);
        shapes[2].resize(Math.random() * 100);
        System.out.println(Arrays.toString(shapes));
    }
}
