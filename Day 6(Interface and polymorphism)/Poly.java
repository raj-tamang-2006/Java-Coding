class Poly{
    public static void main(String[] args){
        Bike bike = new Bike();
        Car car = new Car();
        Boat boat = new Boat();
        
        Vehicle[] vehicle = {bike,car,boat};
        //using for each loop
        for(Vehicle v: vehicle){
            v.go();
        }
    }
}

abstract class Vehicle{
    abstract void go();
}

class Bike extends Vehicle{
    @Override
    public void go(){
        System.out.println("The User is Riding a Bike");
    }
}

class Car extends Vehicle{
    @Override
    public void go(){
        System.out.println("The User is Driving a Car");
    }
}
class Boat extends Vehicle{
    @Override
    public void go(){
        System.out.println("The User is Sailing a Boat");
    }
}