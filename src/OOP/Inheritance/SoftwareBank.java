package OOP.Inheritance;
import java.util.UUID;
class Account{
    private final String uuid = UUID.randomUUID().toString();
    private final String accountType;
    private Double amountOfCash;
    public Account(String accountType, Double amountOfCash){
        this.amountOfCash = amountOfCash;
        this.accountType = accountType;
    }
    public void deposit(Double amountOfCashToDeposit){
        this.amountOfCash =
                (this.amountOfCash==null?0D:this.amountOfCash)
                        + amountOfCashToDeposit;
    }
    public void withdraw(Double amountOfCashToWithdraw){
        if(this.amountOfCash<amountOfCashToWithdraw){
            System.out.println("Your balance is lower than amount you withdraw");
        }else {
            this.amountOfCash -=amountOfCashToWithdraw;
        }
    }
    public void showBalance(){
        System.out.println(STR."Your \{this.accountType} account remains: " + this.amountOfCash);
    }
}
public class SoftwareBank {
    public static void main(String[] args) {
        Account savingAccount = new Account("Saving",50D);
        savingAccount.deposit(30D);
        savingAccount.withdraw(10D);
        savingAccount.showBalance();
        //CreditCard
        Account creditCard = new Account("CreditAccount",20d);
        creditCard.showBalance();
    }
}
