package Loan;
public class VIPLoan implements Loan {
    float interest=(float)10/100;
    @Override
    public float calculateTotalLoanInterest(float year, float amount){
        return year*amount*interest;
    }
}
