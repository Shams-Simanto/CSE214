public class Loan implements Operations{
    @Override
    public void calculateTotalInterest(Customer customer, int year){
        int amount=customer.getAmount();
        float rate=customer.getLoanInterestrate();
        float totalInterest= rate*amount*year;
        System.out.println("Total Interest: $"+ totalInterest);
        System.out.println("After the time passes the total amount will be: $"+(amount-totalInterest));
    }
}
