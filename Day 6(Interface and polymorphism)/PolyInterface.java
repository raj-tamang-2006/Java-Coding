class PolyInterface{
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

interface Vehicle{
    void go();
}

class Bike implements Vehicle{
    @Override
    public void go(){
        System.out.println("The User is Riding a Bike");
    }
}

class Car implements Vehicle{
    @Override
    public void go(){
        System.out.println("The User is Driving a Car");
    }
}
class Boat implements Vehicle{
    @Override
    public void go(){
        System.out.println("The User is Sailing a Boat");
    }
}