import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int choice;

        while(true){
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();

                    if(withdraw > balance){
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                        System.out.println("Balance = " + balance);
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();

                    balance += deposit;
                    System.out.println("Deposit successful.");
                    System.out.println("Balance = " + balance);
                    break;

                case 3:
                    System.out.println("Current Balance = " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}