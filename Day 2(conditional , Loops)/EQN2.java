import java.util.*;
class EQN2{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("For equations\nA(x^2) + BX + c1 = 0");
        System.out.println("Enter the value of A, B and C: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        double x1 = (-1*b+ Math.sqrt(b*b-4*a*c)) / (2 * a);
        double x2 = (-1*b- Math.sqrt(b*b-4*a*c)) / (2 * a);
        System.out.println("X1 = "+ x1 + " and "+ x2);
        sc.close();
    }
}

/*

Output
For equations
A(x^2) + BX + c1 = 0
Enter the value of a1, b1 and c1: 
12 15 3
X1 = -0.25 and -1.0
*/