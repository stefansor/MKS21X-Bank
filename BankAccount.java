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
  public String getPassword(){
    return password;
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

}
