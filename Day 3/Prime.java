import java.util.*;

class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a numbers: ");
        int num = sc.nextInt();
        int c = 0;
        for(int i = 2; i < num /2; i++){
            if(num % i == 0){
                c++;
                break;
            }
        }
        if(c == 0) System.out.println("it is a prime number");
        else System.out.println("it is not a prime number");
    }
}
/*

OUTPUT

Give me a numbers: 9
it is not a prime number


Give me a numbers: 73
it is a prime number

*/