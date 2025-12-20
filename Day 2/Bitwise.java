import java.util.Scanner;
class Bitwise{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " & " + b +" =  "+ (a&b));
        System.out.println(a + " | " + b +" =  " + (a|b));
        System.out.println(a + " ^ " + b +" =  " + (a^b));
        System.out.println("~ " + a + " = " + (~a));
        System.out.println("~ " + b + " = " + (~b));
    }
}

//Output

/*

Enter any two numbers: 5 6
5 & 6 =  4
5 | 6 =  7
5 ^ 6 =  3
~ 5 = -6
~ 6 = -7

*/