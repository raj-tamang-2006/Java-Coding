import java.util.*;
class SWITCH{
    public static void main (String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a number 1 - 7: ");
        int num = sc.nextInt();

        switch(num){
            case 1 : System.out.println("Sunday"); break;
            case 2 : System.out.println("Monday"); break;
            case 3 : System.out.println("Tuesday"); break;
            case 4 : System.out.println("Wednesday"); break;
            case 5 : System.out.println("Thursday"); break;
            case 6 : System.out.println("Friday"); break;
            case 7 : System.out.println("Saturday"); break;
            default : System.out.println("Enter a number from 1 to 7");
        }
        sc.close();                
    }

}

// OUTPUT

/* 

Pick a number 1 - 7: -12
Enter a number from 1 to 7

Pick a number 1 - 7: 7
Saturday
*/