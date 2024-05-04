import java.util.Scanner;

public class AtmInterface {

    private static int balance = 30000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int option = getOption(scanner);

            switch (option) {
                case 1:
                    withdrawFunds(scanner);
                    break;
                case 2:
                    depositFunds(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("-----** Welcome To ATM **-------");
        System.out.println("--------------------------------");
        System.out.println("Option 1: Withdraw");
        System.out.println("Option 2: Deposit");
        System.out.println("Option 3: Check Balance");
        System.out.println("Option 4: Exit");
        System.out.println("Choose any one of option above: ");
    }

    private static int getOption(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void withdrawFunds(Scanner scanner) {
        System.out.println("Enter withdraw amount:");
        int withdrawAmount = scanner.nextInt();
        if (balance < withdrawAmount) {
            System.out.println("Sorry, insufficient balance");
        } else {
            balance -= withdrawAmount;
            System.out.println("Successfully withdrawn");
        }
        System.out.println("--------------------------------");
    }

    private static void depositFunds(Scanner scanner) {
        System.out.println("Enter deposit amount:");
        int depositAmount = scanner.nextInt();
        balance += depositAmount;
        System.out.println("Successfully deposited");
        System.out.println("--------------------------------");
    }

    private static void checkBalance() {
        System.out.println("Your account balance is: " + balance);
        System.out.println("--------------------------------");
    }

    private static void exit() {
        System.out.println("Thank you for using the ATM. Goodbye!");
        System.exit(0);
    }
}
