package PART_2;
import java.util.Scanner;

public class simple_bank_program {
    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);
        int balance = 5000;
        int option;

        do {
            System.out.println("ACTIONS TO PERFORM:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an Option: ");
            option = ab.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the money to be withdrawn: ");
                    int withdraw = ab.nextInt();

                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful! Your new balance is: " + balance);
                    } else {
                        System.out.println("Not Sufficient Balance!");
                    }
                    break;

                case 2:
                    System.out.print("Enter the money to be deposited: ");
                    int deposit = ab.nextInt();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful! Your new balance is: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.println("Your Balance is: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
            System.out.println();
        } while (option != 4);

        ab.close();
    }
}
