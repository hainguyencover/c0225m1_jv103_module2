public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public static void main(String[] args) {
        Fan fan1 = new Fan(1, true, 5, "red");
        Fan fan2 = new Fan(3, true, 10, "yellow");
        Fan fan3 = new Fan(2, false, 5, "blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());

    }

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
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
