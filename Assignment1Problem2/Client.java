import java.util.Scanner;

import CustomerFactory.AbstractCustomerFactory;


public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose customer type: VIP, Regular, Premium");
        String customerType = scanner.nextLine();

        AbstractCustomerFactory customerFactory = CustomerFactoryProducer.getCustomerFactory(customerType);
        System.out.println("Enter amount:");
        float amount = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter number of years:");
        float years = Float.parseFloat(scanner.nextLine()); 

        //scanner.nextLine();
        System.out.println("Choose operation type: Accounts, Loan");
        String operationType=scanner.nextLine();

        if(operationType.equalsIgnoreCase("Loan")){
            System.out.println("Total Loan interest: "+ customerFactory.createLoan().calculateTotalLoanInterest(years, amount));
        }
        else if (operationType.equalsIgnoreCase("Accounts")) {
            System.out.println("Total Accounts interest: "+ customerFactory.createAccounts().calculateTotalAccountsInterest(years, amount));
        }
        else{
            System.out.println("Invalid operation");
        }
        scanner.close();
    }
}
