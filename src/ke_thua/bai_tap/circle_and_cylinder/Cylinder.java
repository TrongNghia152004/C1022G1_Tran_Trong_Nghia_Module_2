package ke_thua.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    private float length;

    public Cylinder(double radius, String color, float length) {
        super(radius, color);
        this.length = length;
    }

    public Cylinder() {

    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getVolume() {
        return getArea() * this.length;
    }

    @Override
    public String toString() {
        return "Cylinder{"
                +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                "length=" + length +
                ", volume=" + getVolume() +
                '}';
    }
}
