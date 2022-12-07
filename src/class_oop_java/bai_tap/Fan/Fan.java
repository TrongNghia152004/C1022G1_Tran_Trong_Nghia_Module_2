package class_oop_java.bai_tap.Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
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
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
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
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on\n");
            state += ("Speed: " + this.speed + "\n");
        } else {
            state += ("Fan is off\n");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }
}

