import java.util.Scanner;

class Arithmetic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Give me two numbers : ");
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        
        System.out.println("Sum : " + (a+b));
        System.out.println("Difference : " + (a-b));
        System.out.println("Product : " + (a*b));
        System.out.println("Quotient : " + (a/b));
        System.out.println("Remainder : " + (a%b));
        sc.close();
    }
}

// OUTPUT
/* 
Give me two numbers : 47 5
Sum : 52
Difference : 42
Product : 235
Quotient : 9
Remainder : 2
*/