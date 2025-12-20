import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int multi(int a, int b) {
        return a * b;
    }

    int quo(int a, int b) {
        return a / b;
    }

    int mod(int a, int b) {
        return a % b;
    }

    int pow(int a, int b) {
        int value = 1;
        for (int i = 0; i < b; i++) {
            value *= a;
        }
        return value;
    }
}

public class OOP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();

        int choice = 0;

        while (choice != 7) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Remainder");
            System.out.println("6. Exponent");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                switch (choice) {
                    case 1 -> System.out.println("Result: " + obj.add(a, b));
                    case 2 -> System.out.println("Result: " + obj.sub(a, b));
                    case 3 -> System.out.println("Result: " + obj.multi(a, b));
                    case 4 -> {
                        if (b != 0)
                            System.out.println("Result: " + obj.quo(a, b));
                        else
                            System.out.println("Error: Division by zero");
                    }
                    case 5 -> {
                        if (b != 0)
                            System.out.println("Result: " + obj.mod(a, b));
                        else
                            System.out.println("Error: Division by zero");
                    }
                    case 6 -> System.out.println("Result: " + obj.pow(a, b));
                }
            } else if (choice != 7) {
                System.out.println("Invalid choice. Please select from 1 to 7.");
            }
        }

        System.out.println("Calculator exited.");
        sc.close();
    }
}