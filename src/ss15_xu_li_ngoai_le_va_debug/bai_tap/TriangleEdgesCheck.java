package ss15_xu_li_ngoai_le_va_debug.bai_tap;

public class TriangleEdgesCheck {
    public void triangleEdgesCheck(double a , double b , double c) throws IllegalTriangleException{
        if (a + b > c && b + c > a && c + a > b && a > 0 && b > 0 && c > 0){
                System.out.println("a , b , c là cạnh của tam giác");
            }else {
               throw new IllegalTriangleException();
            }
        }
}
