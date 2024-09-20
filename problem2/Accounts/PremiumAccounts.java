package Accounts;
public class PremiumAccounts implements Accounts{
    float interest=(float)3.5/100;
    @Override
    public float calculateTotalAccountsInterest(float year, float amount){
        return year*amount*interest;
    }
}
