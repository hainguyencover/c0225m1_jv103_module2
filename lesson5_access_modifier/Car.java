public class Car {
    private String name;
    private String engineer;
    public static int numberOfCars;
    public Car(String name, String engineer) {
        this.name = name;
        this.engineer = engineer;
        numberOfCars++;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Car1", "Engineer1");
        System.out.println("Total number of cars: " + Car.numberOfCars);
        Car car2 = new Car("Car2", "Engineer2");
        System.out.println("Total number of cars: " + Car.numberOfCars);
        Car car3 = new Car("Car3", "Engineer3");
        System.out.println("Total number of cars: " + Car.numberOfCars);
    }
}
