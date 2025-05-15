import java.awt.*;

public class FanClass {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public static void main(String[] args) {
        FanClass fan1 = new FanClass(1, true, 5, "red");
        FanClass fan2 = new FanClass(3, true, 10, "yellow");
        FanClass fan3 = new FanClass(2, false, 5, "blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());

    }

    public FanClass() {
    }

    public FanClass(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Fan is on with speed: " + speed + ", radius: " + radius + ", the color is: " + color + ", and fan is: " + true;
        } else {
            return "Fan is off with speed: " + speed + ", radius: " + radius + ", the color is: " + color + ", and fan is: " + false;
        }
    }
}
