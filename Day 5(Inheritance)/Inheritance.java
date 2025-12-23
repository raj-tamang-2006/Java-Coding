import java.util.*;

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give me your name: ");
        String name = sc.nextLine();

        System.out.print("Tell me your salary, please: ");
        double s = sc.nextDouble();

        System.out.println("Are you an\n1. Employee\n2. Manager");
        System.out.print("Choose (1/2): ");
        int choice = sc.nextInt();

        while (choice != 1 && choice != 2) {
            System.out.println("choose 1 or 2, please");
            choice = sc.nextInt();
        }

        if (choice == 1) {
            Employee e = new Employee(name, s);
            e.displayInfo();
        } else {
            sc.nextLine(); // consume newline
            System.out.print("What's your department? ");
            String dep = sc.nextLine();

            Manager m = new Manager(name, s, dep);
            m.displayInfo();
        }

        sc.close();
    }
}

class Employee {
    protected String name;
    protected double salary;

    Employee(String n, double s) {
        this.name = n;
        this.salary = s;
    }

    double bonus() {
        return salary * 0.1;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + bonus());
        System.out.println("Total amount: $" + (salary + bonus()));
    }
}

class Manager extends Employee {
    String department;

    Manager(String n, double s, String d) {
        super(n, s);
        this.department = d;
    }

    @Override
    double bonus() {
        return salary * 0.2;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
