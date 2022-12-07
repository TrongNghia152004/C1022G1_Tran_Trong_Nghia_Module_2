package class_oop_java.bai_tap.Fan;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed;
    private boolean on;
    private String color;
    private double radius;


    public Fan() {
        this(1, false, "blue", 5);
    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSLOW() {
        return slow;
    }

    public int getMEDIUM() {
        return medium;
    }

    public int getFAST() {
        return fast;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String toString() {
        String result = "";
        if (this.isOn()) {
            result += ("Fan is on\n");
            result += ("Speed: " + this.speed + "\n");
        } else {
            result += ("Fan is off\n");
        }
        result += ("Color: " + this.color + "\n");
        result += ("Radius: " + this.radius + "\n");
        return result;
    }
}

