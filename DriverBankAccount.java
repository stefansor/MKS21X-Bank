public class DriverBankAccount {
  public static void main(String[]args){
    BankAccount a = new BankAccount(400, 12345678, "tighten up by the drells");
    System.out.println("Account: " + a.getAccountID() + "\t" + "Balance: " + a.getBalance()
    + "Password: " + a.getPassword());

    a.setPassword("tighten up by Archie Bell and the Drells");
    System.out.println("Account: " + a.getAccountID() + "\t" + "Balance: " + a.getBalance()
    + "Password: " + a.getPassword());

    a.deposit(200);
    System.out.println("Account: " + a.getAccountID() + "\t" + "Balance: " + a.getBalance()
    + "Password: " + a.getPassword());

    a.withdraw(300);
    System.out.println("Account: " + a.getAccountID() + "\t" + "Balance: " + a.getBalance()
    + "Password: " + a.getPassword());

    a.withdraw(400);
    System.out.println("Account: " + a.getAccountID() + "\t" + "Balance: " + a.getBalance()
    + "Password: " + a.getPassword());
  }
}
