public class Inheritence {
    public static void main(String[] args){
        Cars c1 = new Cars("Toyota", 150.34 , 4);
        c1.displayCarInfo();
    }
}
public class Vehicles{
    protected String brand;
    protected double speed;
    
    Vehicles(String b, double s){
        this.brand = b;
        this.speed = s;
    }
    
    void display(){
        System.out.println("Brand: "+ brand);
        System.out.println("Speed: "+speed+" miles/hours");
    }
}

public class Cars extends Vehicles{
    int seats;
    Cars(String b, double sp, int se){
        super(b,sp);
        this.seats = se;
    }
    void displayCarInfo(){
        display();
        System.out.println("Seats: "+ seats);
    }
}


/*
OUTPUT

Brand: Toyota
Speed: 150.34 miles/hours
Seats: 4
*/