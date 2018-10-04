public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(double newbalance, int newaccountID, String newpassword){
    balance = newbalance;
    accountID = newaccountID;
    password = newpassword;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public void setPassword(String nnp){
    password = nnp;
  }
  public String toString(){
    return "" + accountID + "\t" + balance;
  }
  public boolean deposit(double money){
    if (money >= 0){
      balance = balance + money;
      return true;
    }
    return false;
  }
  public boolean withdraw(double money){
    if (money > balance){
      return false;
    }
    balance = balance - money;
    return true;
  }
  private boolean authenticate(String password){
    if (this.password.equals(password)){
      return true;
    }
    return false;
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    if(this.authenticate(password)){
      if(amount > 0 && amount <= this.balance){
        this.withdraw(amount);
        other.deposit(amount);
        return true;
      }
    }
    return false;
  }
}
