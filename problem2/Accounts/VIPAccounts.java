package Accounts;
public class VIPAccounts implements Accounts {
    float interest=(float)5/100;
    @Override
    public float calculateTotalAccountsInterest(float year, float amount){
        return year*amount*interest;
    }
}
