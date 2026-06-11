import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        char n;
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Enter the operation to perform (+, -, *, /): ");
        n = sc.next().charAt(0);

        switch (n) {
            case '+':
                System.out.println("Result: " + (x + y));
                break;
            case '-':
                System.out.println("Result: " + (x - y));
                break;
            case '*':
                System.out.println("Result: " + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println("Result: " + (x / y));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}
