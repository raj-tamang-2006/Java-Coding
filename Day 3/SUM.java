import java.util.*;

class SUM{
    public static boolean prime(int a){
        if(a < 2) return false;
        if(a == 2) return true;
        for(int i = 2; i < a/2; i++){
            if(a % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int a = 0,b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Even number greater than 2: ");
        int num = sc.nextInt();
        if(num % 2 == 1){
            System.out.println("You were suppose to enter an even number. ");
            return;
        }
        for(int i = 2; i < num; i++){
            for(int j = 2; j < num; j++){
                if(prime(i) && prime(j)){
                    if(i + j == num){
                        a = i;
                        b = j;
                    }
                }
            }
        }
        System.out.println("The sum of Prime numbers " + a +" and "+b+" is "+ num);
        
    }
}

/* OUTPUT


Enter an Even number greater than 2: 12
The sum of Prime numbers 7 and 5 is 12

Enter an Even number greater than 2: 77
You were suppose to enter an even number. 

*/