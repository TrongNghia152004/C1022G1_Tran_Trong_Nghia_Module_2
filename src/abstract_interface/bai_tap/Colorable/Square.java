package abstract_interface.bai_tap.Colorable;

public class Square extends ShapeColor {
    private double edge;

    public Square() {
    }

    public Square(boolean fill, String color, double edge) {
        super(fill, color);
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

    public void howToColor() {
        if (super.isFill() == true) {
            System.out.println("Color all four sides.." + " color= " + super.getColor());
        } else {
            System.out.println("No fill color...");
        }
    }

    @Override
    public String toString() {
        return "Square{" + "fill=" +
                super.isFill() +
                ", edge=" + edge +
                ", area=" + getArea() +
                '}';
    }
}
