package access_modifier.bai_tap.access_modifier;

public class AccessModifier {
    private double radius;
    private String color;

    public AccessModifier() {
        this(1,"red");
    }
    public AccessModifier( double radius , String color){
        this.radius = radius;
        this.color = color;
    }

    public AccessModifier(double radius) {
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
