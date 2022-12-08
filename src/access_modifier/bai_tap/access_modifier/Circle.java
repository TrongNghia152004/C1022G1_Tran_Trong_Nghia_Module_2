package access_modifier.bai_tap.access_modifier;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this(1,"red");
    }
    public Circle( double radius , String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return Math.pow(this.radius, 2) * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
