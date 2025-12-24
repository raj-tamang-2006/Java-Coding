import java.util.*;
class PolyTime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an animal\n1. Dog\n2. Cat");
        System.out.print("Choice(1 or 2): ");
        int c = sc.nextInt();
        
        switch(c){
            case 1:
                Animal dog = new Dog();
                dog.Sound();
                break;
            case 2:
                Animal cat = new Cat();
                cat.Sound();
                break;
            default: System.out.println("Invalid Choice");
        }
    }
}

interface Animal{
    void Sound();
}

class Cat implements Animal{
    @Override
    public void Sound(){
        System.out.println("The Cats Meows");
    }
}

class Dog implements Animal{
    @Override
    public void Sound(){
        System.out.println("The Dog barks");
    }
}
/*

OUTPUT

Choose an animal
1. Dog
2. Cat
Choice(1 or 2): 1
The Dog barks

*/