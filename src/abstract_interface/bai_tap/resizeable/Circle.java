package abstract_interface.bai_tap.resizeable;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
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

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius * percent;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + super.getColor() +
                ", radius=" + radius +
                ", area=" + getArea() +
                '}';
    }
}
