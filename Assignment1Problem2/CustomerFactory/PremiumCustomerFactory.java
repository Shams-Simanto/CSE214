package CustomerFactory;

import Loan.Loan;
import Loan.PremiumLoan;
import Accounts.Accounts;
import Accounts.PremiumAccounts;

public class PremiumCustomerFactory implements AbstractCustomerFactory {
    @Override
    public Loan createLoan(){
        return new PremiumLoan();
    }
    @Override
    public Accounts createAccounts(){
        return new PremiumAccounts();
    }
}
