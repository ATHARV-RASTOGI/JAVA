package ASSI3;

public class q3 {
	private String accountNumber;
	 private double balance;
	 private AccountType accountType;
	 public q3(String accountNumber, double balance, AccountType accountType) {
	 this.accountNumber = accountNumber;
	 this.balance = balance;
	 this.accountType = accountType;
	 }
	public void deposit(double amount) {
	 balance += amount;
	 System.out.println("Deposited: " + amount);
	 System.out.println("New Balance: " + balance);
	 }
	public String getAccountNumber() {
	 return accountNumber;
	 }
	public double getBalance() {
	 return balance;
	 }
	public AccountType getAccountType() {
	 return accountType;
	 }
	public static void main(String[] args) {
	 q3 account1 = new q3("12345", 1000.0, AccountType.SAVINGS);
	 account1.deposit(500.0);
	 account1.deposit(300.0);
	 }
	}
	enum AccountType {
	 SAVINGS, CURRENT
}