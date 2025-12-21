import java.util.*;

class Palidrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int num = sc.nextInt();
        
        int org = num;
        int rev = 0;
        while(num != 0){
            int i = num % 10;
            rev = rev * 10 + i;
            num /=10;
        }
        if( org == rev ) System.out.print("It is a palindrome number.");
        else System.out.print("It is not a palindrome number.");
    }
}

/*

OUTPUT

Give me a number: 121
It is a palindrome number.

*/