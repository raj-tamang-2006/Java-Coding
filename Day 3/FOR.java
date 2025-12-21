import java.util.*;

class FOR{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Give me a Number: ");
        int num = sc.nextInt();
    
        int sum = 0, fact = 1;
        for(int i = 1; i <= num; i++){
            sum += i;
            fact *= i;
        }
    
        System.out.println("The sum of all the numbers till "+ num + " is " + sum);
        System.out.println("The Factorial of "+ num + " is " + fact);
    }
}

// Output

/* 
Give me a Number: 5
The sum of all the numbers till 5 is 15
The Factorial of 5 is 120
*/