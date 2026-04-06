import java.util.Scanner;

public class SmartPayment {

    void pay(double amount) {
        System.out.println("Paid Rs " + amount + " using Cash");
    }

    void pay(double amount, String cardType) {
        System.out.println("Paid Rs " + amount + " using " + cardType + " Card");
    }

    void pay(String upiId, double amount) {
        System.out.println("Paid Rs " + amount + " using UPI ID: " + upiId);
    }

    void pay(double amount, int months) {
        double emi = amount / months;
        System.out.println("Paid Rs " + amount + " in " + months + " months EMI");
        System.out.println("Monthly EMI: Rs " + emi);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartPayment sp = new SmartPayment();

        while (true) {
            System.out.println("\n--- Smart Payment Menu ---");
            System.out.println("1. Cash Payment");
            System.out.println("2. Card Payment");
            System.out.println("3. UPI Payment");
            System.out.println("4. EMI Payment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double cashAmount = sc.nextDouble();
                    sp.pay(cashAmount);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double cardAmount = sc.nextDouble();
                    System.out.print("Enter card type (Debit/Credit): ");
                    String cardType = sc.next();
                    sp.pay(cardAmount, cardType);
                    break;

                case 3:
                    System.out.print("Enter UPI ID: ");
                    String upiId = sc.next();
                    System.out.print("Enter amount: ");
                    double upiAmount = sc.nextDouble();
                    sp.pay(upiId, upiAmount);
                    break;

                case 4:
                    System.out.print("Enter total amount: ");
                    double emiAmount = sc.nextDouble();
                    System.out.print("Enter number of months: ");
                    int months = sc.nextInt();
                    sp.pay(emiAmount, months);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}