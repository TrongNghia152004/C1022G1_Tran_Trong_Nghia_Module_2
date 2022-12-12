package abstract_interface.bai_tap.resizeable;

public class Square extends Shape {
    private double edge;

    public Square(String color, double edge) {
        super(color);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return Math.pow(this.edge, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + super.getColor() +
                ", x=" + this.edge +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.edge = this.edge + this.edge * percent;
    }
}
