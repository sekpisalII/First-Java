package Method;

public class Car {  // Public class accessible from anywhere

    private String model;  // Private member, accessible only within Car
    protected int horsePower;  // Protected member, accessible within Car and subclasses

    public void startEngine(){  // Public method, accessible from anywhere
        System.out.println("Engine started!");
    }

    void accelerate() {  // Default method (package-private), accessible within the same package
        System.out.println("Car is accelerating!");
    }
    public static void main (String [] args ){
        Car cars = new Car();
        AccessModifier obj = new AccessModifier();
        cars.startEngine();
    }

}