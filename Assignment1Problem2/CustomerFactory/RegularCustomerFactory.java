package CustomerFactory;

import Loan.Loan;
import Loan.RegularLoan;
import Accounts.Accounts;
import Accounts.RegularAccounts;

public class RegularCustomerFactory implements AbstractCustomerFactory {
    @Override
    public Loan createLoan(){
        return new RegularLoan();
    }
    @Override
    public Accounts createAccounts(){
        return new RegularAccounts();
    }
}
