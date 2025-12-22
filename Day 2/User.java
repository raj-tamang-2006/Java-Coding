// to take user input in java we use Scanner class
import java.util.Scanner;

class User{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Give me a number: ");
        int a =  sc.nextInt(); 
        System.out.println("The value of a is " + a);
        sc.close();
    }
}

// Output

/* 
Give me a number: 112
The value of a is 112
*/