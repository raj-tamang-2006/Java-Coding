
class AnonymousClass{
    public static void main(String[] aegs){
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo Says Hello beautiful");
            }
        };
        
        dog1.speak();
        dog2.speak();
    }
}
class Dog{
    void speak(){
        System.out.println("The dog says *woof woof*");
    }
}

