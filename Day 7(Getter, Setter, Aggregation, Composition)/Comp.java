class Comp{
    public static void main(String[] args){
        Car c = new Car("Toyota", 7, "VB");
        c.start();
        c.stop();
    }
}

class Car{
    String name;
    int speed;
    Engine engine;
    Car(String n, int s, String e){
        this.name = n;
        this.speed = s;
        this.engine = new Engine(e);
    }
    void start(){
        engine.start();
        System.out.println("The "+name+" has started");
    }
    void stop(){
        engine.stop();
        System.out.println("The "+name+" has stopped");
    }
    
}

class Engine{
    String type;
    Engine(String t){
        this.type = t;
    }
    
    void start(){
        System.out.println("The "+ type + " engine has started");
    }
    void stop(){
        System.out.println("The "+type+" engine has stopped");
    }
}