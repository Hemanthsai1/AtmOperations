import java.util.*;
public class Atm {
 
    public static void main(String[] args) {
        // Prompt user for user ID and PIN
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your user ID and PIN:");
        String userID = scan.nextLine();
        String userPin = scan.nextLine();
 
        // Authenticate the user
        if (authentication(userID, userPin)) {
            // Prompt user with ATM features
            System.out.println("Please select an option:");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
 
            // Read user input
            int userChoice = scan.nextInt();
 
            // Handle user input
            switch (userChoice) {
                case 1:
                    // Show Transactions History
                    showTransactionsHistory();
                    break;
                case 2:
                    // Withdraw
                    withdraw();
                    break;
                case 3:
                    // Deposit
                    deposit();
                    break;
                case 4:
                    // Transfer
                    transfer();
                    break;
                case 5:
                    // Quit
                    quit();
                    break;
            }
        }
 
        // Authentication failed
        else {
            System.out.println("Authentication failed. Please try again.");
        }
    }
 
    // Authentication method
    private static boolean authentication(String userID, String userPin) {
        //Code to authenticate user goes here
         return true;
    }
 
    // Show Transactions History
    private static void showTransactionsHistory() {
        //Code to show transactions history goes here
    }
 
    // Withdraw
    private static void withdraw() {
        //Code to withdraw goes here
    }
 
    // Deposit
    private static void deposit() {
        //Code to deposit goes here
    }
 
    // Transfer
    private static void transfer() {
        //Code to transfer goes here
    }
 
    // Quit
    private static void quit() {
        //Code to quit goes here
    }
}
