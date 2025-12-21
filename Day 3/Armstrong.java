import java.util.*;

class Armstrong{
    public static int mult(int num, int times){
        int result = 1;
        for(int i = 0; i < times; i++){
            result *= num;
        }
        return result;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        String num = sc.nextLine();
        int len = num.length();
        int org1 = Integer.parseInt(num);
        int org2 = org1;
        int value = 0;
        while (org1 != 0){
            int i = org1 % 10;
            value = value + mult(i,len);
            org1 /= 10;
        }
        
        if (value == org2) System.out.println("Its an armstrong number");
        else System.out.println("Its not an armstrong number");
    }
}

/* Output 


Give me a number: 
153
Its an armstrong number


Give me a number: 
125
Its not an armstrong number

*/