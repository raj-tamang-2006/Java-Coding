import java.util.*;
class EQN{
    public static int abs(int num){
        if(num > 0) return num;
        return -1*num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("For equations\na1x1 + b1x2 = c1\na2x1 + b2x2 = c2");
        System.out.println("Enter the value of a1, b1 and c1: ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter the value of a2 , b2 and c2: ");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int x1= 0,x2 = 0;
        for(int i = 0; i < abs(a1)* abs(a2)*abs(b1)* abs(b2); i++){
            for(int j = 0; j < abs(a1)* abs(a2)*abs(b1)* abs(b2); j++){
                if(((a1*i + b1*j) == c1) &&((a2*i + b2 * j) == c2)){
                    x1 = i;
                    x2 = j;
                    break;
                }
            }
        }
        System.out.println("X1 = "+ x1 + " and X2 = "+ x2);
    }
}

/*

Output


For equations
a1x1 + b1x2 = c1
a2x1 + b2x2 = c2
Enter the value of a1, b1 and c1: 
1 2 3
Enter the value of a2 , b2 and c2: 
4 5 9
X1 = 1 and X2 = 1
*/