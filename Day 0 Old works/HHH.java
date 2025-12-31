class Garage{
    private String Car_brand;
    private int speed;
    
    public Garage(String car,int sp ){
        this.Car_brand = car;
        this.speed = Math.max(sp,0);
    }
    
    public String display(){
        return Car_brand+" is running at speed "+speed;
    }
}

public class HHH{
    public static void main(String[] args){
        Garage[] car = new Garage[3];
        
        
        car[0] = new Garage("Ferrari",189);
        car[1] = new Garage("BMW",-127);
        car[2] = new Garage("Lambo",120);
        for (int i = 0; i < 3; i++){
            String var = car[i].display();
            System.out.println(var);
        }
    }
}
