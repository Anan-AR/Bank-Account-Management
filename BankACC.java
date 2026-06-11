import java.util.Scanner;

public class BankACC {
    int balance = 0;

    public void depo(int amount) {

        System.out.println("Amount deposited:" + amount);
        balance += amount;
    }

    public void with(int amount) {
        if (amount > balance) {
            System.out.println("invalid amount");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn:" + amount);
            System.out.println("balance remeaning:" + balance);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BankACC account = new BankACC();
        int x;
        int y;
        int choice;
        do {
            System.out.println("Enter operation \n1.Deposit\n2.Withdraw\n3>balance\n4.exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit");
                    x = sc.nextInt();
                    account.depo(x);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw");
                    y = sc.nextInt();
                    account.with(y);
                    break;
                case 3:
                    System.out.println("balance" + account.balance);
                    break;
                case 4:
                    System.out.println("exiting");
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (choice != 4);
        sc.close();
    }

}
