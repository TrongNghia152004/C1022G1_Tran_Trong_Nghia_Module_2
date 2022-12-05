package class_oop_java.bai_tap.Fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, "green", 10);
        Fan fan2 = new Fan(2, false, "black", 5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

