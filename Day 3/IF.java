import java.util.Scanner;

class IF{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me Your age please: ");
        int age = sc.nextInt();

        if(age >= 18) System.out.println("You can Vote");
        else System.out.println("You can't vote");
    }
}