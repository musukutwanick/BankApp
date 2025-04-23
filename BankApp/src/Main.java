import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("Nick Musukutwa", 100.00); // renamed to lowercase for convention

        System.out.println("Welcome " + account.getAccountHolder() + " to the Bank Account Management System");

        while (true) {
            System.out.println("\n--Banking Menu--");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Get Balance");
            System.out.println("4. Get Account Holder");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice: ");


            if (!scanner.hasNextInt()) {
                System.out.println("Invalid option. Please enter a number.");
                scanner.next(); // consume invalid input
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    if (scanner.hasNextDouble()) {
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next();
                    }
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    if (scanner.hasNextDouble()) {
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next();
                    }
                    break;

                case 3:
                    account.getBalance();
                    break;

                case 4:
                    System.out.println("Account Holder: " + account.getAccountHolder());
                    break;

                case 5:
                    System.out.println("Thank you for using our service!");
                    return; // exit the program

                default:
                    System.out.println("Please enter a number between 1 and 5.");
            }
        }
    }
}
