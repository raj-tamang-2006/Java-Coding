import java.util.Scanner;

class Relational{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me any three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a > b) && (a > c)){
            System.out.println(a + " is the largest number");
        }
        else if(b > c){
            System.out.println(b + " is the largest number");
        }
        else {
            System.out.println(c + " is the largest number");
        }
        sc.close();
    }
}

//OUTPUT

/* 

Give me any three numbers: 123 456 78
456 is the largest number

*/