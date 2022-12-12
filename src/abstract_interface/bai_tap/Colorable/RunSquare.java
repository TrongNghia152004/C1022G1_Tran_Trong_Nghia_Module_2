package abstract_interface.bai_tap.Colorable;

import java.util.Arrays;

public class RunSquare {
    public static void main(String[] args) {
        ShapeColor [] squares = new Square[3];
        squares[0] = new Square(true,"blue" ,3);
        squares[1] = new Square(false,"green",6);
        squares[2] = new Square(false,"red",9);
        System.out.println(Arrays.toString(squares));
        System.out.println("Có phải colorable hay không");
        squares[0].howToColor();
        squares[1].howToColor();
        squares[2].howToColor();
    }
}
