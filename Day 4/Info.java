import java.util.Scanner;
class Info{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's Name: ");
        String n = sc.nextLine();
        System.out.println("Enter the student's Roll Number: ");
        int r = sc.nextInt();
        System.out.println("Enter the student's Marks: ");
        double m = sc.nextDouble(); 
        
        Student s1 = new Student(n,r,m);
        s1.display();
        s1.isPassed();
        sc.close();
    }
}
class Student{
    private String name;
    private int Roll;
    private double marks;
    
    Student(String n, int r, double m){
        this.name = n;
        this.Roll = r;
        this.marks = m;
    }
    void isPassed(){
        if(marks >= 40) System.out.println("The Student has passed");
        else System.out.println("The Student has Failed");
    }
    void display(){
        System.out.printf("Student Details\nName : %s\nRoll Number : %d\nMarks : %.2f\n",name,Roll,marks);
    }
}

/*
OUTPUT

Enter the student's Name: 
Raj Tamang
Enter the student's Roll Number: 
030
Enter the student's Marks: 
98.5
Student Details
Name : Raj Tamang
Roll Number : 30
Marks : 98.50
The Student has passed

*/
