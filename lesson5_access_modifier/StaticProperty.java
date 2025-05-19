public class StaticProperty {
    private String name;
    private String engineer;
    public static int numberOfCars;
    public StaticProperty(String name, String engineer) {
        this.name = name;
        this.engineer = engineer;
        numberOfCars++;
    }

    public static void main(String[] args) {
        StaticProperty car1 = new StaticProperty("Car1", "Engineer1");
        System.out.println("Total number of cars: " + StaticProperty.numberOfCars);
        StaticProperty car2 = new StaticProperty("Car2", "Engineer2");
        System.out.println("Total number of cars: " + StaticProperty.numberOfCars);
        StaticProperty car3 = new StaticProperty("Car3", "Engineer3");
        System.out.println("Total number of cars: " + StaticProperty.numberOfCars);
    }
}
