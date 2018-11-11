
public abstract class Account {


	protected double balance;
	private Person customer;
	
	// constructor
	public Account() {
		this.customer=null;
		this.balance=0.0;
	}
	public Account (double amount, Person customer) {
		this.customer=customer;
		this.balance=amount;
		
	}
	
	/////////////////
	
	public void deposit(double amount) 
	{
		this.balance = this.balance+amount;
	}
	/////////////////
	public double getBalance() {
		return balance;
	}
	////////////////////
	public void withDraw(double amount) 
	{
		this.balance=this.balance-amount;
	}
	@Override
	public String toString() {
		return "balance=" + balance + ", customer=" + customer ;
	}
	

	

}
