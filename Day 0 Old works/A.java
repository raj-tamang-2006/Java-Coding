interface Vehicle {
    void startEngine();
}

class Car implements Vehicle {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void startEngine() {
        System.out.println("The " + brand + " car roars to life with a smooth hum!");
    }
}

class Bike implements Vehicle {
    private String brand;

    public Bike(String brand) {
        this.brand = brand;
    }

    @Override
    public void startEngine() {
        System.out.println("The " + brand + " bike revs up with a powerful vroom!");
    }
}

public class A {
    public static void main(String[] args) {
        Vehicle car = new Car("Tesla");
        Vehicle bike = new Bike("Ducati");

        car.startEngine();
        bike.startEngine();
    }
}
