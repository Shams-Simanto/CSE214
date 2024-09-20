package Loan;
public class PremiumLoan implements Loan {
    float interest=(float)12/100;
    @Override
    public float calculateTotalLoanInterest(float year, float amount){
        return year*amount*interest;
    }
}
