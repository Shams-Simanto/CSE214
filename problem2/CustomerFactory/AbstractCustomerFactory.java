package CustomerFactory;

import Loan.Loan;
import Accounts.Accounts;
public interface AbstractCustomerFactory {
    Loan createLoan();
    Accounts createAccounts();
}
