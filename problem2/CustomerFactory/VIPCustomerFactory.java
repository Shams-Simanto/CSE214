package CustomerFactory;

import Loan.Loan;
import Loan.VIPLoan;
import Accounts.Accounts;
import Accounts.VIPAccounts;

public class VIPCustomerFactory implements AbstractCustomerFactory {
    
    @Override
    public Loan createLoan(){
        return new VIPLoan();
    }
    @Override
    public Accounts createAccounts(){
        return new VIPAccounts();
    }
}
