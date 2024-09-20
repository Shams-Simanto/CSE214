package Loan;
public class RegularLoan implements Loan{
    float interest=(float)14/100;
    @Override
    public float calculateTotalLoanInterest(float year, float amount){
        return year*amount*interest;
    }
}
