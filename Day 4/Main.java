public class Main{
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println("Car 1: ");
        c1.model = "Porsche 718";
        c1.price = 100000.00 ;
        c1.color = "Black";
        c1.Display();
        System.out.println("\nCar 2: ");
        c2.model = "Mercedes-Benz E450";
        c2.price = 78000.23;
        c2.color = "Bluce";
        c2.Display();
    }
}
class Car{
    String model;
    Double price;
    String color;
    
    void Display(){
        System.out.println("Model: "+ model+"\nPrice: $"+price+"\nColor: "+color);
    }
}


/*OUTPUT



Car 1: 
Model: Porsche 718
Price: $100000.0
Color: Black

Car 2: 
Model: Mercedes-Benz E450
Price: $78000.23
Color: Bluce

*/
