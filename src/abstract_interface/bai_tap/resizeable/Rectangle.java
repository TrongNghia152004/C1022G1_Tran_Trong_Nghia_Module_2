package abstract_interface.bai_tap.resizeable;

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + " Color=" + super.getColor() +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + this.width * percent;
        this.length = this.length + this.length * percent;
    }
}
