// Resolve the conflict and call both interface methods.

class Main{
    public static void main(String[] args){
        C c = new C();
        c.show();
    }
}

interface A {
    default void show(){
        System.out.println("This is interface A");
    }
}
interface B{
    default void show(){
        System.out.println("This is inteface B");
    }
}

class C implements A,B{
    @Override 
    public void show(){
        A.super.show();
        B.super.show();
    }
}



