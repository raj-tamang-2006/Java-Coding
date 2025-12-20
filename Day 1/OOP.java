class Demo{
    int add(int i, int j){
        return i+j;
    }
}

public class OOP {
    public static void main(String[] args) {
        Demo obj = new Demo();
        int value = obj.add(12, 13);
        System.err.println(value);
    }
}
