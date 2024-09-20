package Accounts;
public class RegularAccounts implements Accounts {
    float interest=(float)2.5/100;
    @Override
    public float calculateTotalAccountsInterest(float year, float amount){
        return year*amount*interest;
    }
}
