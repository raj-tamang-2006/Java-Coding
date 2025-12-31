abstract class Animal{
    private String ani_name;
    public Animal(String ani_name){
        this.ani_name = ani_name;
    }
    
    public String getAniName() {
        return ani_name;
    }

    public abstract void makeSound();
}

class Dog extends Animal{
    
    public Dog (String dogname){
        super(dogname);
    }
    
    @Override
    public void makeSound(){
        System.out.println(getAniName() + " is playing and making the sound uoffff uoffff");
    }
}

class Cat extends Animal{
    public Cat (String catname){
        super(catname);
    }
    @Override
    public void makeSound(){
        System.out.println(getAniName()  + " is playing and making the sound meow meow ");
    }
}

public class B{
    public static void main(String[] args){
        Dog d1 = new Dog("Samipya");
        Cat c1 = new Cat("Samiksha");
        
        d1.makeSound();
        c1.makeSound();
    }
}