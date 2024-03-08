import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nikita = new Scanner(System.in);
        double balance = 1000.0; 

        while (true) {
            
            System.out.println("ATM Simulator Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

          
            System.out.print("Enter your choice: ");
            int choice = nikita.nextInt();

            
            switch (choice) {
                case 1:
                    System.out.println("Your balance: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = nikita.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: $" + balance);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = nikita.nextDouble();

                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. New balance: $" + balance);
                    } else {
                        System.out.println("Insufficient funds. Withdrawal failed.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}