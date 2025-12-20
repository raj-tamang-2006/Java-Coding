
import java.util.Scanner;

class Assignment{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Give me two numbers : ");
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("a = "+ a + ", b = "+ b);
        System.out.println("c = a+b = "+ c);
        c *= a;
        System.out.println("c = c *= a = "+ c);
        c += b;
        System.out.println("c = c += b = "+ c);
        c -= c;
        System.out.println("c = c -= c = "+ c);
        
    }
}

//Output

/* 
Give me two numbers : 100 12
a = 100, b = 12
c = a+b = 112
c = c *= a = 11200
c = c += b = 11212
c = c -= c = 0
*/