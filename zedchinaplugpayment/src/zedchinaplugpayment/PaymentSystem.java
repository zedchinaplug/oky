package zedchinaplugpayment;

import java.util.Scanner;

public class PaymentSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

System.out.println("Welcome to our payment system!");

        double balance = 1000.00;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Your current balance is $" + balance);

            System.out.print("Enter the amount to pay: $");
            double amountToPay = input.nextDouble();

            if (amountToPay <= balance) {
                balance -= amountToPay;
                System.out.println("Payment successful. Your new balance is $" + balance);
            } else {
                System.out.println("Insufficient balance. Please enter a smaller amount.");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            String continueChoice = input.next();

            if (!continueChoice.equalsIgnoreCase("Y")) {
                isRunning = false;
            }
        }

        System.out.println("Thank you for using our payment system!");
    }
}

