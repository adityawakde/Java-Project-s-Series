import java.util.*;

class ATMSimulation{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double balance = 1000.00;

    System.out.println("Welcome to ATM Simulator");

    System.out.println("1 - Deposit");
    System.out.println("2 - Withdraw");
    System.out.println("3 - Check Balance");
    System.out.println("4 - Exit");
    System.out.println("Enter your choice");

    int choice = sc.nextInt();

    switch (choice){
        case 1:
            System.out.println("Enter amount to deposit"); 
            double deposit = sc.nextDouble();

            if (deposit > 0) {
            double updated = balance + deposit;
            System.out.println("Updated Balance after Deposit: " + updated);
            } else {
                System.out.println("Invalid amount");
            }
            break;

        case 2:
            System.out.println("Enter amount to withdraw");
        double withdraw = sc.nextDouble();

            if ( withdraw > 0 || withdraw <= balance){
                double updated = balance - withdraw;
                System.out.println("Updated Balance after Withdrawal: " + updated);
            } else {
                System.out.println("Invalid amount or Insufficient Balance");
            }
            break;

            case 3:
                System.out.println("Current Balance:" + balance);
            break;

            case 4:
                System.out.println("Thank you for using the ATM Simulator");
                sc.close();
                System.exit(0);

            default:
            System.out.println("Invalid Choice");  
        }
    }
}