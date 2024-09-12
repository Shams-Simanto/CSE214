public class RegularCustomer implements Customer {
    private int amount=0;
    @Override
    public int getAmount(){
        return amount;
    }
    @Override
    public void setAmount(int amount){
        this.amount=amount;
    }
    @Override
    public float getLoanInterestrate(){
        return (float)14/(float)100;
    }
    @Override
    public float getAccountsInterestrate(){
        return (float)2.5/(float)100;
    }
}