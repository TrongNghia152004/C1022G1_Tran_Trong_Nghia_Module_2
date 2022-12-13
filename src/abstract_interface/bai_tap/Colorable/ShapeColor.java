package abstract_interface.bai_tap.Colorable;

public abstract class ShapeColor implements IColorable {
    private boolean fill;
    private String color;

    public ShapeColor() {
    }

    public ShapeColor(boolean fill, String color) {
        this.fill = fill;
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ShapeColor{" +
                "fill=" + fill +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void howToColor() {

    }
}
